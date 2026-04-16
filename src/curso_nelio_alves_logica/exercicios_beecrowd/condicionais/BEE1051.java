package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class BEE1051 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto = 0;
        double valorTotal = 0;

        if (salario >= 0 && salario <= 2000) {
            imposto = 0;
        } else if (salario > 2000 && salario <= 3000) {
            imposto = 8;
            valorTotal = (salario - 2000) * (imposto / 100);
        } else if (salario > 3000 && salario <= 4500) {
            imposto = 18;
            valorTotal = 80 + ((salario - 3000) * (imposto / 100));
        } else {
            imposto = 28;
            valorTotal = 350 + ((salario - 4500) * (imposto / 100));
        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", valorTotal);
        }

        sc.close();
    }
}
