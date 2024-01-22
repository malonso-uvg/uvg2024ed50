public class Calculadora1 implements ICalculator{

    
    /** 
     * This class allow you to execute an addition of two integers
     * @param n1 first number
     * @param n2 second number
     * @return int total
     */
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    /** 
     * This class allow you to execute an sustraction of two integers
     * @param n1 first number
     * @param n2 second number
     * @return int the difference
     */
    @Override
    public int mult(int n1, int n2) {
        return n1 * n2;
    }
    
}
