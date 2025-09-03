package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumaEnteros() {

        int a = -2;
        int b = 1;
        int resultado = -1;

        int resultadoActual = Calculadora.sumaEnteros(a, b);

        assertEquals(resultado, resultadoActual);
    }
}