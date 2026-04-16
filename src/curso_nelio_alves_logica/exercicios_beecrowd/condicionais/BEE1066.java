package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Scanner;

public class BEE1066 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPar = 0;
        int totalImpar = 0;
        int totalPos = 0;
        int totalNeg = 0;

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                totalPar++;
            } else {
                totalImpar++;
            }

            if (num > 0) {
                totalPos++;
            } else if (num < 0)  {
                totalNeg++;
            }
        }

        System.out.println(totalPar + " valor(es) par(es)");
        System.out.println(totalImpar + " valor(es) impar(es)");
        System.out.println(totalPos + " valor(es) positivo(s)");
        System.out.println(totalNeg + " valor(es) negativo(s)");

        sc.close();
    }
}
