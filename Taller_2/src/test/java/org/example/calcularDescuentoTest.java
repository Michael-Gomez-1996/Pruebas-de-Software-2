package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class calcularDescuentoTest {

    @Test
    void aplicarDescuento() {

        BigDecimal precio = BigDecimal.valueOf(200000);
        BigDecimal resultadoEsperado = BigDecimal.valueOf(180000);

        BigDecimal resultadoActual = calcularDescuento.aplicarDescuento(precio);

        assertEquals(resultadoActual, resultadoEsperado);
    }
    @Test
    void NoAplicarDescuento() {

        BigDecimal precio = BigDecimal.valueOf(90000);
        BigDecimal resultadoEsperado = BigDecimal.valueOf(90000);

        BigDecimal resultadoActual = calcularDescuento.aplicarDescuento(precio);

        assertEquals(resultadoActual, resultadoEsperado);
    }

}