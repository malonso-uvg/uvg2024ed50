import java.util.ArrayList;

public interface ICalculadoraPostfix{
	ArrayList<String> validateExpression(String expression) throws Exception;
	
	int resolve(ArrayList<String> expression) throws Exception;
}