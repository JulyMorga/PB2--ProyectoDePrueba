package ar.com.morga.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.com.morga.Resta;

public class RestaTest {

    @Test
    public void testRestaPositivos() {
        double resultado = Resta.restar(5.2, 2.8);
        assertEquals(2.4, resultado, 0.001);
    }

    @Test
    public void testRestaNegativos() {
        double resultado = Resta.restar(-3.5, -1.7);
        assertEquals(-1.8, resultado, 0.001);
    }

    @Test
    public void testRestaCero() {
        double resultado = Resta.restar(4.0, 4.0);
        assertEquals(0.0, resultado, 0.001);
    }
}
