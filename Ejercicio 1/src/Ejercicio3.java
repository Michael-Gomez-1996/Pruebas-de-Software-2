public class Ejercicio3 {
    public static boolean ContrasenaSegura(String contrasena) {
        if (contrasena.length() < 8) return false;

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean especial = false;
        String especiales = "!@#$%^&*";

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) mayuscula = true;
            else if (Character.isLowerCase(c)) minuscula = true;
            else if (Character.isDigit(c)) numero = true;
            else if (especiales.indexOf(c) != -1) especial = true;
        }

        return mayuscula && minuscula && numero && especial;
    }

    public static void main(String[] args) {
        System.out.println("Contraseña 'Abc123$%': " + ContrasenaSegura("Abc123$%"));
        System.out.println("Contraseña 'password': " + ContrasenaSegura("password"));
        System.out.println("Contraseña 'ABC12345': " + ContrasenaSegura("ABC12345"));
    }
}
