package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int maior = Math.max(X, Y);
        int menor = Math.min(X, Y);

        int somaImpar = 0;

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
               somaImpar += i;
            }
        }

        System.out.println(somaImpar);

        sc.close();
    }
}
