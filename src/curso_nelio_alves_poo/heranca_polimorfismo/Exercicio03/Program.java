package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio03;

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
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i' || ch == 'I') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, fee));
            } else if (ch == 'c' || ch == 'C') {
                products.add(new Product(name, price));
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), dtf);

                products.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println("\nPrice Tags: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
