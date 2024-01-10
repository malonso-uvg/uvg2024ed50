import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testMultiplicacionAmbosPositivos() {
        Calculadora miCalculadora = new Calculadora();
        Assert.assertEquals(6, miCalculadora.multiplicacion(3, 2));
    }

    @Test
    public void testMultiplicacion1Negativo2Positivo() {
        Calculadora miCalculadora = new Calculadora();
        Assert.assertEquals(-6, miCalculadora.multiplicacion(-3, 2));
    }

    @Test
    public void testMultiplicacion1Positivo2Negativo() {
        Calculadora miCalculadora = new Calculadora();
        Assert.assertEquals(-6, miCalculadora.multiplicacion(3, -2));
    }

        @Test
    public void testMultiplicacionPorCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0, calculadora.multiplicacion(0, 10));
    }

    @Test
    public void testResta() {

    }

    @Test
    public void testSumaPositivos() {
        Calculadora miCalculadora = new Calculadora();
        Assert.assertEquals(5, miCalculadora.suma(3, 2));
    }

    @Test
    public void testSumaPrimeroNegativoSegundoPositivo() {
        Calculadora miCalculadora = new Calculadora();
        Assert.assertEquals(-1, miCalculadora.suma(-3, 2));
    }

    @Test
    public void testSumaPrimeroPositivoSegundoNegativo() {
        Calculadora miCalculadora = new Calculadora();
        Assert.assertEquals(1, miCalculadora.suma(3, -2));
    }
}

