package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();

        int[] vet = new int[N];
        int totalPar = 0;
        int somaPar = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0) {
                totalPar++;
                somaPar += vet[i];
            }
        }

        double media = (double) somaPar / totalPar;

        if (totalPar > 0) {
            System.out.printf("Média dos pares = %.2f%n", media);
        } else {
            System.out.println("Nenhum número par");
        }

        sc.close();
    }
}
