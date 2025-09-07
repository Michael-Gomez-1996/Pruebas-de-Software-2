package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmailFinderTest {

    @Test
    void debeEncontrarUsuarioPorEmailExistente() {

        List<User> usuarios = Arrays.asList(
                new User("michael", "michael@email.com"),
                new User("andrea", "andrea@email.com"),
                new User("carlos", "carlos@email.com")
        );
        EmailFinder finder = new EmailFinder();

        User resultado = finder.findUserByEmail(usuarios, "andrea@email.com");

        assertNotNull(resultado);
        assertEquals("andrea", resultado.getUsername());
    }

    @Test
    void debeDevolverNullSiEmailNoExiste() {

        List<User> usuarios = Arrays.asList(
                new User("michael", "michael@email.com"),
                new User("andrea", "andrea@email.com")
        );
        EmailFinder finder = new EmailFinder();

        User resultado = finder.findUserByEmail(usuarios, "noexiste@email.com");

        assertNull(resultado);
    }
}
