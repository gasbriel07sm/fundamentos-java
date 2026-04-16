package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("NULL");
            } else if (num % 2 == 0) {
                System.out.print("EVEN ");
            } else if (num % 2 != 0) {
                System.out.print("ODD ");
            }

            if (num > 0) {
                System.out.println("POSITIVE");
            } else if (num < 0) {
                System.out.println("NEGATIVE");
            }
        }

        sc.close();
    }
}
