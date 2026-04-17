package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] vet = new double[N];
        double maior = Double.MIN_VALUE;
        int posicao = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextDouble();

            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(posicao);

        sc.close();
    }
}
