package curso_nelio_alves_poo.introducao_poo.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: ");
        double grossSalary =  sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee emp = new Employee(name, grossSalary, tax);

        System.out.println("\nEmployee: " + emp.toString());

        System.out.print("\nWhich percentage to increase salary? ");
        emp.increaseSalary(sc.nextDouble());

        System.out.println("\nUpdated data: " + emp.toString());

        sc.close();
    }
}
