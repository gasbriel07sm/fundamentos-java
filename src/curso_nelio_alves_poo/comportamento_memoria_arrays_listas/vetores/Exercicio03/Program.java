package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int N = sc.nextInt();

        Pessoa[] vet = new Pessoa[N];

        double somaAlturas = 0.0;
        int pessoasMenores16 = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("\nDados da %dº pessoa: %n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vet[i] = new Pessoa(nome, idade, altura);
            somaAlturas += vet[i].getAltura();

            if (vet[i].getIdade() < 16) {
                pessoasMenores16++;
            }
        }

        double mediaAlturas = somaAlturas / vet.length;

        System.out.printf("\nAltura média: %.2f%n", mediaAlturas);
        System.out.printf("Pessoa com menos de 16 anos: %.2f %% %n", ((double) pessoasMenores16 / vet.length) * 100);
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                System.out.println(vet[i].getNome());
            }
        }

        sc.close();
    }
}
