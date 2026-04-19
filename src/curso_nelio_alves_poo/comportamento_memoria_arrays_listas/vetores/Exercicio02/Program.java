package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        double[] vet = new double[N];
        double soma = 0.0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        double media = soma / vet.length;

        System.out.print("Valores: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%.2f ",  vet[i]);
        }
        System.out.println("\nSoma: " + String.format("%.2f", soma));
        System.out.printf("Média: %.2f", media);

        sc.close();
    }
}
