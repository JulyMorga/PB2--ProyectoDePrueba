package ar.com.morga.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.com.morga.Suma;

class SumaTest {
    @Test
    public void testSumaPositivos() {
        double resultado = Suma.sumar(2.5, 3.7);
        assertEquals(6.2, resultado, 0.001);
    }

    @Test
    public void testSumaNegativos() {
        double resultado = Suma.sumar(-1.2, -5.8);
        assertEquals(-7.0, resultado, 0.001);
    }

}
