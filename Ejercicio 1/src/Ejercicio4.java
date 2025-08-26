public class Ejercicio4 {
    public static void contarVocalesConsonantes(String texto) {
        int vocales = 0;
        int consonantes = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    public static void main(String[] args) {
        contarVocalesConsonantes("la casa tiene paredes azules");
        contarVocalesConsonantes("me gusta estar aqui y estudiar programacion");
    }
}
