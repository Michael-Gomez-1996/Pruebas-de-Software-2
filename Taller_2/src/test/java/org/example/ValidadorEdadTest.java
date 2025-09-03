package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorEdadTest {

    @Test
    void esMayorEdad() {
        int edad = 25;
        boolean mayor = true;
        boolean edadActual = ValidadorEdad.esMayorEdad(edad);
        assertEquals(mayor, edadActual);
    }

    @Test
    void esMenorEdad() {
        int edad = 17;
        boolean mayor = false;
        boolean edadActual = ValidadorEdad.esMayorEdad(edad);
        assertEquals(mayor, edadActual);

    }
}