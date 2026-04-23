package reforco_poo.lista02.bloco05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        List<Order> list = new ArrayList<>();

        System.out.print("Orders? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Order #: ");
            int number = sc.nextInt();
            sc.nextLine(); // buffer

            System.out.print("Table: ");
            int table = sc.nextInt();
            sc.nextLine(); // buffer

            System.out.print("Sector (INDOOR/OUTDOOR): ");
            TableSector sector = TableSector.valueOf(sc.nextLine().toUpperCase());

            Table t = new Table(table, sector);

            System.out.print("Moment (DD/MM/YYYY HH:mm): ");
            LocalDateTime moment = LocalDateTime.parse(sc.nextLine(), dtf);

            System.out.print("Items (how many): ");
            int items = sc.nextInt();
            sc.nextLine(); // buffer

            List<MenuItem> listMenu = new ArrayList<>();

            for (int j = 1; j <= items; j++) {
                System.out.printf("Item %d name: ", j);
                String nameItem = sc.nextLine();

                System.out.print("Price: ");
                double priceItem = sc.nextDouble();
                sc.nextLine();

                System.out.print("Qty: ");
                int qtyItem = sc.nextInt();
                sc.nextLine();

                listMenu.add(new MenuItem(nameItem, priceItem, qtyItem));
            }

            list.add(new Order(number, t, moment, listMenu));
        }

        double totalDay = 0.0;

        System.out.println();

        for (Order o: list) {
            System.out.println(o.toString());
            totalDay += o.total();
        }

        System.out.printf("\nTOTAL DAY REVENUE: $ %.2f%n", totalDay);

        sc.close();
    }
}
