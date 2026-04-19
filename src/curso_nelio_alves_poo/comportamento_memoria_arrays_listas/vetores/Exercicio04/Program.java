package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        int[] vet = new int[N];
        int totalPar = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0) {
                totalPar++;
            }
        }

        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println("\nQuantidade de pares = " + totalPar);

        sc.close();
    }
}
