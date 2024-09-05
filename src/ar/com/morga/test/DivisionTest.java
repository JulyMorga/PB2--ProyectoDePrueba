package ar.com.morga.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.com.morga.Division;

class DivisionTest {

    @Test
    public void testDivisionPositivos() {
        double resultado = Division.divisionPrecisa(10, 2);
        assertEquals(5, resultado, 0.001);
    }

    @Test
    public void testDivisionNegativos() {
        double resultado = Division.divisionPrecisa(-12.6, -3.15);
        assertEquals(4.0, resultado, 0.001);
    }

    @Test
    public void testDivisionCero() {
        double resultado = Division.divisionPrecisa(5.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, resultado, 0.001);
    }

}
