package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Scanner;

public class BEE1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPar = 0;

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                totalPar++;
            }
        }

        System.out.println(totalPar + " valores pares");

        sc.close();
    }
}
