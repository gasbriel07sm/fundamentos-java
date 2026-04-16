package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                break;
            } else {
                int maior = Math.max(M, N);
                int menor = Math.min(M, N);
                int soma  = 0;

                for (int i = menor; i <= maior; i++) {
                    soma += i;
                    System.out.print(i + " ");
                }
                System.out.println("Sum=" + soma);
            }
        }

        sc.close();
    }
}
