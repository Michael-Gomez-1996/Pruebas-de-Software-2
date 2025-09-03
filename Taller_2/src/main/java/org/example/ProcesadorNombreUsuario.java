package org.example;

public class ProcesadorNombreUsuario {
    public static String nombre(String name) {
        if ("admi".equalsIgnoreCase(name)) {
            return null;
        }
        return name;
    }
}
