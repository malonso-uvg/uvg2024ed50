public class Calculadora2 implements ICalculator{

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int mult(int n1, int n2) {
       int resultado = 0;

        // Utilizar un bucle para sumar 'a' a 'resultado' 'b' veces
        for (int i = 0; i < n2; i++) {
            resultado += n1;
        }

        return resultado;
    }
    
}
