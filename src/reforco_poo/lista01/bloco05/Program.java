package reforco_poo.lista01.bloco05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Code: ");
        String code = sc.next();
        sc.nextLine(); // limpeza do buffer

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Expiration: ");
        LocalDate expiration = LocalDate.parse(sc.next(), dtf);

        StockProduct product = new StockProduct(code, name, price, quantity, expiration);

        System.out.println("\n" + product.toString());

        System.out.print("Add stock: ");
        quantity = sc.nextInt();
        product.addStock(quantity);

        System.out.println("\n" + product.toString());

        System.out.print("Remove stock: ");
        quantity = sc.nextInt();
        product.removeStock(quantity);

        System.out.println("\n" + product.toString());

        sc.close();
    }
}
