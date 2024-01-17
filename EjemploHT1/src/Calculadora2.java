public class Calculadora2 implements ICalculator{

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int mult(int n1, int n2) {
       int resultado = 0;

       boolean n1IsNegative = n1 < 0;
       boolean n2IsNegative = n2 < 0;

       if (n2IsNegative)
       {
            n2 = -n2;
       }

        // Utilizar un bucle para sumar 'a' a 'resultado' 'b' veces
        for (int i = 0; i < n2; i++) {
            resultado += n1;
        }

        if (n1IsNegative == n2IsNegative){
            if (resultado < 0)
                resultado = -resultado;
        }

        return resultado;
    }
    
}
