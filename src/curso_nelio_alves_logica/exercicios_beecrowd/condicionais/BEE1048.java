package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        int taxaReajuste = 0;

        if (salario >= 0 && salario <= 400) {
            taxaReajuste = 15;
        } else if (salario > 400 && salario <= 800) {
            taxaReajuste = 12;
        } else if (salario > 800 && salario <= 1200) {
            taxaReajuste = 10;
        } else if (salario > 1200 && salario <= 2000) {
            taxaReajuste = 7;
        } else if (salario > 2000) {
            taxaReajuste = 4;
        }

        double reajusteGanho = salario * ((double) taxaReajuste / 100);
        double novoSalario = salario + reajusteGanho;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        System.out.printf("Em percentual: %d %%%n", taxaReajuste);

        sc.close();
    }
}
