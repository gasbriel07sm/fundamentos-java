package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();

        double[] vet =  new double[N];
        double soma = 0.0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();

            soma += vet[i];
        }

        double media = soma / vet.length;

        System.out.printf("\nMédia do vetor: %.3f%n", media);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
