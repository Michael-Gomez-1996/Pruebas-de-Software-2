public class Ejercicio2 {
    public static boolean Inversa(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        for (int i = 0; i < palabra1.length(); i++) {
            if (palabra1.charAt(i) != palabra2.charAt(palabra2.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("¿'hola' y 'aloh' son inversas?: " + Inversa("hola", "aloh"));
        System.out.println("¿'casa' y 'saca' son inversas?: " + Inversa("casa", "saca"));
    }
}
