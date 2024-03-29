/**
 * 
 */
package edu.uvg.interpreter;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * @author MAAG
 *
 */
public class Interpreter {

	private HashMap<String, Integer> myVars;

	public Interpreter() {
		myVars = new HashMap<String, Integer>();
	}
	
	public IOperationResult Operate(String expresion) {
		int state = SintaxScanner.getState(expresion);
		
		switch(state) {
		case 1:{
			return variableAssigment(expresion);
		}
		
		case 2:{
			return addOperation(expresion);
		}
		
		case 3:{
			return restaOperation(expresion);
		}
		
		default:{
			
			//Using anonymous Inner class
			IOperationResult errorResult = new IOperationResult() {

				
				@Override
				public void performOperation() {
					System.out.println("ERROR: Invalid expression");
					
				}

				@Override
				public void addResults(String key, String result) {
					// TODO Auto-generated method stub
				}
				
			};
			return errorResult;
		}
		
		}
		
	}
	
	private IOperationResult variableAssigment(String expresion) {
		 Pattern pattern = Pattern.compile("[ ]+[a-z]+[ ]+", Pattern.CASE_INSENSITIVE); //
	     Matcher matcher = pattern.matcher(expresion);
	     String varName = "";
	     Integer varValue = 0;
	     if (matcher.find()) {
	         varName = matcher.group().trim();
	     }
	     
	     pattern = Pattern.compile("[ ]+[0-9]+[ ]*", Pattern.CASE_INSENSITIVE); //
	     matcher = pattern.matcher(expresion);
	     if (matcher.find()) {
	    	 varValue = Integer.parseInt(matcher.group().trim());
	     }
	     
	     //Agrego la variable
	     myVars.put(varName, varValue);
	     
	     //Using anonymous Inner class
	     IOperationResult assigmentResult = new IOperationResult() {
			
			String key = "";
			String value = "";
			
			@Override
			public void performOperation() {
				System.out.println("Variable: " + key + " asignada con valor " + value);				
			}

			@Override
			public void addResults(String key, String result) {
				this.key = key;
				this.value = result;
			}
			
				
		};

		assigmentResult.addResults(varName, varValue.toString());
		
	    return assigmentResult;  
	    
	}
	
	private IOperationResult addOperation(String expresion) {
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher = pattern.matcher(expresion);
	    Integer total = 0;
	    
	    while (matcher.find()) {
			try {
				int sumando = Integer.parseInt(matcher.group().trim());
				total  = total + sumando;
			} catch(NumberFormatException e){ //Significa que viene una variable
				//Verifico si la variable existe o no
				String variable = matcher.group().trim();

				//Si existe entonces uso su valor
				if (myVars.get(variable) != null){ //Existe
					int sumando = myVars.get(variable);
					total  = total + sumando;
				} else { //No existe


					//Using anonymous Inner class
					IOperationResult errorResult = new IOperationResult() {

						
						@Override
						public void performOperation() {
							System.out.println("ERROR: variable " + variable + " No encontrada");
							
						}

						@Override
						public void addResults(String key, String result) {
							// TODO Auto-generated method stub
						}
						
					};
					return errorResult;


				}

			}
	    	
	    }
	    
	    AritmethicOperationResult miResult = new AritmethicOperationResult();
	    miResult.addResults(" suma ", "" + total);
	    return miResult;
	}
	
	private IOperationResult restaOperation(String expresion) {
		Pattern pattern = Pattern.compile("([a-z]+|[0-9]+)", Pattern.CASE_INSENSITIVE); //
	    Matcher matcher = pattern.matcher(expresion);
	    Integer total = 0;
		int count = 0;
	    
	    while (matcher.find()) {

			if (count == 0){
				total = Integer.parseInt(matcher.group().trim());
			} else {
				total = total - Integer.parseInt(matcher.group().trim());
			}
			count++;
	    	
	    }
	    
	    AritmethicOperationResult miResult = new AritmethicOperationResult();
	    miResult.addResults(" resta ", "" + total);
	    return miResult;
	}
}
