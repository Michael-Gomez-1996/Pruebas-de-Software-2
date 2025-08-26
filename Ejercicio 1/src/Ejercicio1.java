public class Ejercicio1 {
    public static boolean OrdenAscendente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {5, 2, 3, 4};

        System.out.println("¿Arreglo 1 esta ordenado?: " + OrdenAscendente(num1));
        System.out.println("¿Arreglo 2 esta ordenado?: " + OrdenAscendente(num2));
    }
}
