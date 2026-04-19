package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        double[] vet = new double[N];
        double maiorValor = Double.MIN_VALUE;
        int posicaoMaior = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();

            if (vet[i] > maiorValor) {
                maiorValor = vet[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("\nMaior valor = %.2f%n", maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaior);

        sc.close();
    }
}
