package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
