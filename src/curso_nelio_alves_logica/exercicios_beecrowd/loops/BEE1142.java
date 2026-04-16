package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d PUM%n", ((4 * i) - 3), ((4 * i) - 2), ((4 * i) - 1));
        }

        sc.close();
    }
}
