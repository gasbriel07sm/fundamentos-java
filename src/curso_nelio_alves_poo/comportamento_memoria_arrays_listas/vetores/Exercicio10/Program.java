package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int N = sc.nextInt();

        Estudante[] e1 = new Estudante[N];

        for (int i = 0; i < e1.length; i++) {
            sc.nextLine(); // quebra de linha pendente
            System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno: %n", i + 1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            e1[i] = new Estudante(nome, nota1, nota2);
        }

        System.out.println("\nAlunos aprovados: ");
        for (int i = 0; i < e1.length; i++) {
            if (e1[i].media() >= 6.0) {
                System.out.println(e1[i].getNome());
            }
        }

        sc.close();
    }
}
