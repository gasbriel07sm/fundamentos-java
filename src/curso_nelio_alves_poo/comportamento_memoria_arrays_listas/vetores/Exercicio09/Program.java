package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você irá digitar? ");
        int N = sc.nextInt();

        Pessoa[] p1 = new Pessoa[N];

        for (int i = 0; i < p1.length; i++) {
            System.out.printf("\nDados da %dº pessoa: %n", i+1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            p1[i] = new Pessoa(nome, idade);
        }

        int idadeMaisVelha = Integer.MIN_VALUE;
        String pessoaMaisVelha = " ";

        for (Pessoa p : p1) {
            if (p.getIdade() > idadeMaisVelha) {
                idadeMaisVelha = p.getIdade();
                pessoaMaisVelha = p.getNome();
            }
        }

        System.out.println("\nPessoa mais velha: " + pessoaMaisVelha);

        sc.close();
    }
}
