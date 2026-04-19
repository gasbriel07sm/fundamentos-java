package curso_nelio_alves_poo.introducao_poo.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);

        System.out.println(p1.toString());

        System.out.print("\nEnter the number of products to be added in stock: ");
        p1.addProducts(sc.nextInt());
        System.out.println(p1.toString());

        System.out.print("\nEnter the number of products to be removed from stock: ");
        p1.removeProducts(sc.nextInt());
        System.out.println(p1.toString());

        sc.close();
    }
}
