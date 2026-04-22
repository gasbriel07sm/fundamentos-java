package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + ":");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch ==  'i' || ch == 'I'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxPayers.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Numbers of employees: ");
                int employees = sc.nextInt();

                taxPayers.add(new Company(name, annualIncome, employees));
            }
        }

        System.out.println("\nTaxes paid:");

        double total = 0.0;

        for (TaxPayer taxPayer : taxPayers) {
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());

            total += taxPayer.tax();
        }

        System.out.printf("\nTotal taxes: %.2f%n", total);

        sc.close();
    }
}
