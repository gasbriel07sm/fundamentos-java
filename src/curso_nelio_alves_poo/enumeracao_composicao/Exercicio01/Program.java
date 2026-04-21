package curso_nelio_alves_poo.enumeracao_composicao.Exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        Departament dept = new Departament(department);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker w1 = new Worker(name, level, baseSalary, dept);

        System.out.print("How many contracts to this worker? ");
        int numberOfContracts = sc.nextInt();

        for (int i = 1; i <= numberOfContracts; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);

            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao (horas): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            w1.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + w1.getName());
        System.out.println("Departamento: " + w1.getDepartament().getName());
        System.out.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", w1.income(year, month)));

        sc.close();
    }
}
