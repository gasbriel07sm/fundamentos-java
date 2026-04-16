package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= N; i++) {
            int num =  sc.nextInt();

            if (num >= 10 && num <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
