package org.example;

public class TorresVasos {
    public static int cacularTotalVasos(int niveles) {

        if (niveles <= 0) {
            return 0;
        }

  //    for (int i = 1; i <= niveles; i++) {
    //      System.out.println(" * ");

   //   }
        return niveles + cacularTotalVasos(niveles - 1);
    }
}
