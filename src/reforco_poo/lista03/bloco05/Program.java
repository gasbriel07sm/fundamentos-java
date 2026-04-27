package reforco_poo.lista03.bloco05;

import reforco_poo.lista03.bloco05.entities.Expense;
import reforco_poo.lista03.bloco05.enums.Category;
import reforco_poo.lista03.bloco05.repository.ExpenseRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho do arquivo: ");
        String filePath = sc.nextLine();

        ExpenseRepository expenseRepository = new ExpenseRepository(filePath);

        List<Expense> list = expenseRepository.loadAll();

        while (true) {
            System.out.print("Deseja adicionar novos dados? (s/n) ");
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));

            if (ch == 'y') {

                System.out.print("DATE: ");
                LocalDate date = LocalDate.parse(sc.nextLine(), dtf);

                System.out.println("CATEGORY: ");
                Category category = Category.valueOf(sc.nextLine().toUpperCase());

                System.out.println("DESCRIPTION: ");
                String description = sc.nextLine();

                System.out.println("AMOUNT: ");
                double amount = Double.parseDouble(sc.nextLine());

                Expense expense = new Expense(date, category, description, amount);

                expenseRepository.append(expense);
                list.add(expense);
            } else {
                break;
            }
        }

        double total = 0.0;
        double totalFood = 0.0;
        double totalTransport = 0.0;
        double totalHealth = 0.0;
        double totalLeisure = 0.0;
        double totalEducation = 0.0;
        double totalOther = 0.0;

        for (Expense e : list) {
            total += e.getAmount();

            if (e.getCategory() == Category.FOOD) {
                totalFood += e.getAmount();
            } else if (e.getCategory() == Category.TRANSPORT) {
                totalTransport += e.getAmount();
            } else if (e.getCategory() == Category.HEALTH) {
                totalHealth += e.getAmount();
            } else if (e.getCategory() == Category.LEISURE) {
                totalLeisure += e.getAmount();
            } else if (e.getCategory() == Category.EDUCATION) {
                totalEducation += e.getAmount();
            } else {
                totalOther += e.getAmount();
            }

        }

        System.out.println("\nEXPENSE REPORT");
        System.out.printf("Total: $ %.2f%n%n", total);

        if (totalFood > 0) {
            System.out.printf("%-12s $ %7.2f  (%5.1f%%)%n",
                    "FOOD", totalFood, totalFood / total * 100);
        }

        if (totalTransport > 0) {
            System.out.printf("%-12s $ %7.2f  (%5.1f%%)%n",
                    "TRANSPORT", totalTransport, totalTransport / total * 100);
        }

        if (totalHealth > 0) {
            System.out.printf("%-12s $ %7.2f  (%5.1f%%)%n",
                    "HEALTH", totalHealth, totalHealth / total * 100);
        }

        if (totalLeisure > 0) {
            System.out.printf("%-12s $ %7.2f  (%5.1f%%)%n",
                    "LEISURE", totalLeisure, totalLeisure / total * 100);
        }

        if (totalEducation > 0) {
            System.out.printf("%-12s $ %7.2f  (%5.1f%%)%n",
                    "EDUCATION", totalEducation, totalEducation / total * 100);
        }

        if (totalOther > 0) {
            System.out.printf("%-12s $ %7.2f  (%5.1f%%)%n",
                    "OTHER", totalOther, totalOther / total * 100);
        }

    }
}
