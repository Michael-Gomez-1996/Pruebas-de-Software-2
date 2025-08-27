import java.util.Scanner;

public class Ejercicios {

    public static int calcularTotalVasos(int niveles) {
        if (niveles <= 0) {
            return 0;
        }
        return niveles + calcularTotalVasos(niveles - 1);
    }

    public static int calcularTotalGalletas(int galletas) {
        if (galletas <= 0) {
            return 0;
        }
        return galletas + calcularTotalGalletas(galletas / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int niveles = -1;
        while (niveles < 0 || niveles > 99) {
            System.out.print("Ingrese cantidad de niveles : ");
            if (sc.hasNextInt()) {
                niveles = sc.nextInt();
                if (niveles < 0 || niveles > 99) {
                    System.out.println("no puedes ingresar numero negativos ni mayores a 99");
                }
            } else {
                System.out.println("debe ingresar solo números.");
                sc.next();
            }
        }
        System.out.println("Total de vasos es: " + calcularTotalVasos(niveles));


        int galletas = -1;
        while (galletas < 0 || galletas > 99) {
            System.out.print("Ingrese cantidad de galletas : ");
            if (sc.hasNextInt()) {
                galletas = sc.nextInt();
                if (galletas < 0 || galletas > 99) {
                    System.out.println("no puedes ingresar numero negativos ni mayores a 99");
                }
            } else {
                System.out.println("debe ingresar solo números.");
                sc.next();
            }
        }
        System.out.println("Total de galletas es: " + calcularTotalGalletas(galletas));

        sc.close();
    }
}
