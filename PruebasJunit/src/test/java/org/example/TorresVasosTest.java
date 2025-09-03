package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TorresVasosTest {

    @Test
    void cacularVasosPositivo() {

// alistar valores
        int niveles = 5;
        int resultadoEsperado = 15;

//ejecutar el llamado del metodo a probar
        int resultadoActual = TorresVasos.cacularTotalVasos(niveles);

// validacion
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void calcularVasosNegativos() {

// alistar valores
        int niveles = 5;
        int resultadoEsperado = 15;

//ejecutar el llamado del metodo a probar
        int resultadoActual = TorresVasos.cacularTotalVasos(niveles);

// validacion
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void calcularVasoscero() {


// alistar valores
        int niveles = 0;
        int resultadoEsperado = 0;

//ejecutar el llamado del metodo a probar
        int resultadoActual = TorresVasos.cacularTotalVasos(niveles);

// validacion
        assertEquals(resultadoEsperado, resultadoActual);
    }


}

