package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Locale;
import java.util.Scanner;

public class BEE1116 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int n1 =  sc.nextInt();
            int n2 =  sc.nextInt();

            if (n2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", (double) n1/n2);
            }
        }

        sc.close();
    }
}
