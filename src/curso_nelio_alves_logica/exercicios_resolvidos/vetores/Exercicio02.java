package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] vet = new int[N];
        int totalPar = 0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0){
                totalPar++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0){
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println("\n" + totalPar);

        sc.close();
    }
}
