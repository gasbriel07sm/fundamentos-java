package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int maior = Math.max(X, Y);
        int menor = Math.min(X, Y);

        int soma = 0;
        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
