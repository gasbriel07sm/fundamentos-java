package curso_nelio_alves_poo.enumeracao_composicao.Exercicio03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), dtf);
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order? ");
        int N =  sc.nextInt();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 1; i <= N; i++) {
            sc.nextLine(); // buffer
            System.out.printf("\nEnter #%d item data: %n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.items.add(orderItem);
        }

        System.out.println("\nORDER SUMMARY: ");
        System.out.println(order);


        sc.close();
    }
}
