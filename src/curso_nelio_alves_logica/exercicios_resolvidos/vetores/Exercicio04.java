package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] vet =  new double[N];
        double soma = 0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        double media = soma / vet.length;

        System.out.printf("%.3f%n", media);

        for (int i = 0; i < N; i++) {
            if (vet[i] < media) {
                System.out.printf("%.1f%n", vet[i]);
            }
        }

        sc.close();
    }
}
