package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1158 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int soma = 0;

            for (int j = 1; j <= Y; j++) {
                if (X % 2 == 0) {
                    X++;
                    soma += X;
                } else {
                    soma += X;
                }
                X += 2;
            }
            System.out.println(soma);
        }

        sc.close();
    }
}
