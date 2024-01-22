public class Calculadora1 implements ICalculator{

    
    
    /** 
     * Este metodo sirve para hacer una suma
     * @param n1 sumando 1
     * @param n2 sumando 2
     * @return int Devuelve la suma del n1 más el n2
     */
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }


    
    /** 
     * Este método genera la multiplicación de 2 números
     * @param n1 el factor 1
     * @param n2 el factor 2
     * @return int la multiplicación de dos números
     */
    @Override
    public int mult(int n1, int n2) {
        return n1 * n2;
    }
    
}
