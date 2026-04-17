package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] nome = new String[N];
        double[] precoCompra = new double[N];
        double[] precoVenda = new double[N];

        int lucroAb10 = 0;
        int lucroEnt10E20 = 0;
        int lucroAc20 = 0;
        double valorTotalCompra = 0.0;
        double valorTotalVenda = 0.0;
        double lucroTotal = 0.0;

        for (int i = 0; i < N; i++) {
            nome[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();

            double lucro = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            if (lucro < 10) {
                lucroAb10++;
            } else if (lucro >= 10 && lucro <= 20) {
                lucroEnt10E20++;
            } else {
                lucroAc20++;
            }

            valorTotalCompra +=  precoCompra[i];
            valorTotalVenda +=  precoVenda[i];
        }

        lucroTotal = valorTotalVenda - valorTotalCompra;

        System.out.printf("Lucro abaixo de 10%%: %d%n", lucroAb10);
        System.out.printf("Lucro entre 10%% e 20%%: %d%n", lucroEnt10E20);
        System.out.printf("Lucro acima de 20%%: %d%n", lucroAc20);
        System.out.printf("Valor total de compra: %.2f%n", valorTotalCompra);
        System.out.printf("Valor total de venda: %.2f%n", valorTotalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);


        sc.close();
    }
}
