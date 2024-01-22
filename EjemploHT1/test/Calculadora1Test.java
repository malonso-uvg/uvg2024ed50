import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculadora1Test {
    ICalculator miCalc = new Calculadora1(); //Aca pruebo ambas calculadoras solo cambiar la clase

    @Test
    public void testAdd() {
        assertEquals(5, miCalc.add(3, 2));
    }

    @Test
    public void testMult2Positive() {
        assertEquals(6, miCalc.mult(3, 2));
    }

    @Test
    public void testMult2Negative() {
        assertEquals(6, miCalc.mult(-3, -2));
    }
}
