public class Calculadora2 implements ICalculator{

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int mult(int a, int b) {
        int resultado = 0;
        int signo = (a < 0 ^ b < 0) ? -1 : 1; // Determinar el signo del resultado

        a = Math.abs(a);
        b = Math.abs(b);

       
        // Utilizar un bucle para sumar 'a' a 'resultado' 'b' veces
        for (int i = 0; i < b; i++) {
            resultado += a;
        }


        return resultado * signo;

    }
    
}
