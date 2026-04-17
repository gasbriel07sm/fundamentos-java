package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];
        int soma = 0;
        int totalPar = 0;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0) {
                soma += a[i];
                totalPar++;
            }
        }

        double media = (double) soma / totalPar;

        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
