package org.example;

public class ValidarPalindromos {
    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        String limpiandoTexto = texto.replaceAll("\\s+", "").toLowerCase();
        String textoInverso = new StringBuilder(limpiandoTexto).reverse().toString();
        return limpiandoTexto.equals(textoInverso);

    }

}
