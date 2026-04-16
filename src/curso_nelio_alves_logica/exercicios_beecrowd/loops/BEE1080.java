package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1080 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
