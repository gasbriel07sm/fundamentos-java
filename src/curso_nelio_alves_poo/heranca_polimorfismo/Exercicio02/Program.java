package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> listEmp = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data: %n", i);
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y' || ch == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                listEmp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                listEmp.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println("\nPayments: ");

        for (Employee e : listEmp) {
            System.out.println(e);
        }

        sc.close();
    }
}
