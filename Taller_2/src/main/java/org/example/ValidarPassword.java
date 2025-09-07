package org.example;

public class ValidarPassword {
    public boolean fuerte(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean conNumeros = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                conNumeros = true;
                break;
            }
        }
        return conNumeros;
    }

}
