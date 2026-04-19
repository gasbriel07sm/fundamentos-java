package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        int[] vet = new int[N];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Números Negativos: ");
        for (int i = 0; i < vet.length; i++) {
           if (vet[i] < 0) {
               System.out.println(vet[i]);
           }
        }

        sc.close();
    }
}
