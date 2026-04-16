package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int nota = 0;
        int moeda = 0;

        System.out.println("NOTAS:");
        nota = 100;
        System.out.printf("%d nota(s) de R$ %.2f%n", (int) valor / nota, (double) nota);
        valor %= nota;

        nota = 50;
        System.out.printf("%d nota(s) de R$ %.2f%n", (int) valor / nota, (double) nota);
        valor %= nota;

        nota = 20;
        System.out.printf("%d nota(s) de R$ %.2f%n", (int) valor / nota, (double) nota);
        valor %= nota;

        nota = 10;
        System.out.printf("%d nota(s) de R$ %.2f%n", (int) valor / nota, (double) nota);
        valor %= nota;

        nota = 5;
        System.out.printf("%d nota(s) de R$ %.2f%n", (int) valor / nota, (double) nota);
        valor %= nota;

        nota = 2;
        System.out.printf("%d nota(s) de R$ %.2f%n", (int) valor / nota, (double) nota);
        valor %= nota;

        valor *= 100;
        System.out.println("MOEDAS:");

        moeda = 100;
        System.out.printf("%d moeda(s) de R$ %.2f%n", (int) valor / moeda, (double) moeda/100);
        valor %= moeda;

        moeda = 50;
        System.out.printf("%d moeda(s) de R$ %.2f%n", (int) valor / moeda, (double) moeda/100);
        valor %= moeda;

        moeda = 25;
        System.out.printf("%d moeda(s) de R$ %.2f%n", (int) valor / moeda, (double) moeda/100);
        valor %= moeda;

        moeda = 10;
        System.out.printf("%d moeda(s) de R$ %.2f%n", (int) valor / moeda, (double) moeda/100);
        valor %= moeda;

        moeda = 5;
        System.out.printf("%d moeda(s) de R$ %.2f%n", (int) valor / moeda, (double) moeda/100);
        valor %= moeda;

        moeda = 1;
        System.out.printf("%d moeda(s) de R$ %.2f%n", (int) valor / moeda, (double) moeda/100);

        sc.close();
    }
}
