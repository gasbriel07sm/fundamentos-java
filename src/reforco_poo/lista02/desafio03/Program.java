package reforco_poo.lista02.desafio03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Cart cart = new Cart();

        System.out.print("Quantos itens foram comprados? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nItem #%d: %n", i);

            System.out.print("Smartphone / Notebook / Accessory (s/n/a): ");
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Stock: ");
            int stock = Integer.parseInt(sc.nextLine());

            System.out.print("Quantity: ");
            int qty = Integer.parseInt(sc.nextLine());

            Product p = null;

            switch (ch) {
                case 's':
                    System.out.print("Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("StorageGB: ");
                    int storageGB = Integer.parseInt(sc.nextLine());
                    p = new Smartphone(name, price, stock, brand, storageGB);
                    break;
                case 'n':
                    System.out.print("Brand: ");
                    brand = sc.nextLine();
                    System.out.print("RAM GB: ");
                    int ramGB = Integer.parseInt(sc.nextLine());
                    System.out.print("Processor: ");
                    String processor = sc.nextLine();
                    p = new Notebook(name, price, stock, brand, ramGB, processor);
                    break;
                case 'a':
                    System.out.print("Type: ");
                    AccessoryType type = AccessoryType.valueOf(sc.nextLine().toUpperCase());
                    p = new Accessory(name, price, stock, type);
                    break;
            }
            cart.addItem(p, qty);
        }

        System.out.print("Tem promoção? (s/n): ");
        char hasPromotion = Character.toLowerCase(sc.nextLine().charAt(0));

        if (hasPromotion == 's') {
            System.out.print("Promotion discount: ");
            double discountPercent = Double.parseDouble(sc.nextLine());

            System.out.print("Expired Date: ");
            LocalDate expiresAt = LocalDate.parse(sc.nextLine(), dtf);

            cart.setPromotion(new Promotion(discountPercent, expiresAt));
        }

        System.out.println("\nCART SUMMARY: ");
        System.out.println(cart.toString());
        cart.checkout();
        System.out.printf("Total acumulated sales: $ %.2f%n", Cart.getTotalSales());

        sc.close();
    }
}
