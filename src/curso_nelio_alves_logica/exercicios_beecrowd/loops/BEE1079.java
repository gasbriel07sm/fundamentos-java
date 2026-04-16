package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Locale;
import java.util.Scanner;

public class BEE1079 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            double n1 =  sc.nextDouble();
            double n2 =  sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
