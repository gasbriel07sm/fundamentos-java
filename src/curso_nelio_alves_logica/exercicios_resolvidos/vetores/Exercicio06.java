package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] nome = new String[N];
        int[] idade = new int[N];

        int maiorIdade = Integer.MIN_VALUE;
        String pessoaMaisVelha = " ";

        for (int i = 0; i < N; i++) {
            nome[i] = sc.next();
            idade[i] = sc.nextInt();

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                pessoaMaisVelha = nome[i];
            }
        }

        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);

        sc.close();
    }
}
