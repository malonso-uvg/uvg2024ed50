class Calculadora{
    public int suma(int sumando1, int sumando2){
        return sumando1 + sumando2;
    }

    public int resta(int minuendo, int sustraendo){
        return suma(minuendo, -sustraendo);
    }

    public int multiplicacion(int factor1, int factor2){
        int acumulador = 0;
        boolean ambosNegativos = false;

        if ((factor1 > 0) && (factor2 < 0)){
            ambosNegativos = false;
            factor2 = -factor2;
        } else {
            ambosNegativos = true;
        }

        for (int i = 0; i < factor2; i++){
            acumulador = acumulador + factor1;
        }

        if (!ambosNegativos){
            acumulador = -1 * acumulador;
        }

        return acumulador;
    }
}