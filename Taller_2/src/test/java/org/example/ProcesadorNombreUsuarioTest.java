package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorNombreUsuarioTest {

    @Test
    void nombreAdmi() {
        String name = "admi";
        String resultadoEsperado = null;

        String nombreActual = ProcesadorNombreUsuario.nombre(name);

        assertEquals(resultadoEsperado, nombreActual);

    }

    @Test
    void nombre() {
        String name = "andres";
        String resultadoEsperado = "andres";

        String nombreActual = ProcesadorNombreUsuario.nombre(name);

        assertEquals(resultadoEsperado, nombreActual);

    }

}