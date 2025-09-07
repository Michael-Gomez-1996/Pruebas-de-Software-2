package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTareasTest {

    @Test
    void obtenerTareaSinAgregarNull() {

        AdministradorTareas admin = new AdministradorTareas();

        List<String> resultadoActual = admin.optenerTarea();

        assertNull(resultadoActual);
    }

    @Test
    void obtenerTareaConAlMenosUnaDebeNoSerNull() {

        AdministradorTareas admin = new AdministradorTareas();
        admin.adicionarTarea("Tender cama");

        List<String> resultadoActual = admin.optenerTarea();


        assertNotNull(resultadoActual);
        assertEquals(1, resultadoActual.size());
        assertTrue(resultadoActual.contains("Tender cama"));
    }
}
