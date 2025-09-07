package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidarPasswordTest {

    @Test
    void passwordFuerteDebeSerValida() {

        ValidarPassword validador = new ValidarPassword();
        String password = "password123";

        boolean resultado = validador.fuerte(password);

        assertTrue(resultado);
    }

    @Test
    void passwordDebilPorCortaDebeSerInvalida() {

        ValidarPassword validador = new ValidarPassword();
        String password = "asfd1";

        boolean resultado = validador.fuerte(password);

        assertFalse(resultado);
    }

    @Test
    void passwordDebilPorNoTenerNumerosDebeSerInvalida() {

        ValidarPassword validador = new ValidarPassword();
        String password = "asdfghyrs";

        boolean resultado = validador.fuerte(password);

        assertFalse(resultado);
    }
}
