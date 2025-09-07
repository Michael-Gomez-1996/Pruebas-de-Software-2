package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void factorialDeCincoDebeSer120() {

        FactorialCalculator calc = new FactorialCalculator();
        int numero = 5;

        long resultado = calc.factorial(numero);

        assertEquals(120, resultado);
    }

    @Test
    void factorialDeCeroDebeSer1() {

        FactorialCalculator calc = new FactorialCalculator();
        int numero = 0;

        long resultado = calc.factorial(numero);

        assertEquals(1, resultado);
    }

    @Test
    void factorialDeCincoNoDebeSer121() {

        FactorialCalculator calc = new FactorialCalculator();
        int numero = 5;

        long resultado = calc.factorial(numero);

        assertNotEquals(121, resultado);
    }
}
