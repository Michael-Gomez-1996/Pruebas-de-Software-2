package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class comparadorCadenasTest {

    @Test
    void concatenar() {

        String str1 = "JUnit";
        String str2 = "5";
        String resultadoEsperado = "JUnit5";

        String resultadoActual = comparadorCadenas.Concatenar(str1, str2);

        assertEquals(resultadoEsperado, resultadoActual);

    }

    @Test
    void noConcatenar() {

        String str1 = "Hola";
        String str2 = "Mundo";
        String resultadoEsperado = "Hola Mundo";

        String resultadoActual = comparadorCadenas.Concatenar(str1, str2);

        assertNotEquals(resultadoEsperado, resultadoActual);
    }
}