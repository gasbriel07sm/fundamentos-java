package reforco_poo.lista03.bloco01;

import reforco_poo.lista03.bloco01.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Order> list = new ArrayList<>();

        System.out.print("Orders: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Order #%d - Amount: ", i);
            double amount = Double.parseDouble(sc.nextLine());

            System.out.print("Payment (pix / credit / slip): ");
            String payment = sc.nextLine().toLowerCase();

            if (payment.equals("credit")) {
                System.out.print("Installments: ");
                int installments = Integer.parseInt(sc.nextLine());
                list.add(new Order(amount, new CreditCard(installments)));
            } else if (payment.equals("pix")) {
                list.add(new Order(amount, new Pix()));
            } else {
                list.add(new Order(amount, new BankSlip()));
            }
        }

        int indice = 1;
        double totalDaily = 0.0;
        int pixCount = 0;
        int creditCount = 0;
        int slipCount = 0;

        for (Order o: list) {
            System.out.printf("\nORDER #%d - ", indice);
            System.out.println(o);

            totalDaily += o.getPaymentMethod().calculateTotal(o.getAmount());

            if (o.getPaymentMethod() instanceof Pix) {
                pixCount++;
            } else if (o.getPaymentMethod() instanceof CreditCard) {
                creditCount++;
            } else if (o.getPaymentMethod() instanceof BankSlip) {
                slipCount++;
            }

            indice++;
            System.out.println();
        }

        String mostUsed = "PIX";
        int mostUsedCount = pixCount;

        if (creditCount > mostUsedCount) {
            mostUsed = "Credit Card";
            mostUsedCount = creditCount;
        }

        if (slipCount > mostUsedCount) {
            mostUsed = "Boleto Bancário";
            mostUsedCount = slipCount;
        }

        System.out.println("\nDAILY SUMMARY: ");
        System.out.printf("Most used: %s (%dx)%n", mostUsed, mostUsedCount);
        System.out.printf("Total collected: $ %.2f%n", totalDaily);

        sc.close();
    }
}
