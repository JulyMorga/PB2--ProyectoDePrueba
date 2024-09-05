package ar.com.morga.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.com.morga.Producto;

public class ProductoTest {

    @Test
    public void testProductoPositivos() {
        double resultado = (double) Producto.producto(2.5, 3.7);
        assertEquals(9.25, resultado, 0.001);
    }

    @Test
    public void testProductoNegativos() {
        double resultado = Producto.producto(-1.2, -5.8);
        assertEquals(6.96, resultado, 0.001);
    }

    @Test
    public void testProductoCero() {
        double resultado = Producto.producto(4.0, 0.0);
        assertEquals(0.0, resultado, 0.001);
    }
}
