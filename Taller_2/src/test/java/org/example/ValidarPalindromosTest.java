package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidarPalindromosTest {

    @Test
    void esPalindromo() {
        String texto = "Anita lava la tina";
        String resultadoeEsperado = String.valueOf(true);

        String resultadoActual = String.valueOf(ValidarPalindromos.esPalindromo(texto));

        assertEquals(resultadoeEsperado, resultadoActual);

    }

    @Test
    void NoEsPalindromo() {
        String texto = "Filokallianthropía";
        String resultadoeEsperado = String.valueOf(false);

        String resultadoActual = String.valueOf(ValidarPalindromos.esPalindromo(texto));

        assertEquals(resultadoeEsperado, resultadoActual);

    }

    @Test
    void Null() {
        String texto = null;
        String resultadoeEsperado = String.valueOf(false);

        String resultadoActual = String.valueOf(ValidarPalindromos.esPalindromo(texto));

        assertEquals(resultadoeEsperado, resultadoActual);

    }
}