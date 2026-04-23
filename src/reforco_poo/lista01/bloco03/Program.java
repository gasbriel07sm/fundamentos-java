package reforco_poo.lista01.bloco03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Order order;

        System.out.print("Order code: ");
        int code = sc.nextInt();
        sc.nextLine(); // limpeza do buffer

        System.out.print("Client: ");
        String client = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        if (address.equals("")) {
            order = new Order(code, client);
        } else {
            order = new Order(code, client, address);
        }

        System.out.print("Item 1: ");
        String[] item1 = sc.nextLine().trim().split("-");
        String nameItem1 = item1[0];
        double itemPrice1 = Double.parseDouble(item1[1]);
        order.addItem(nameItem1, itemPrice1);

        System.out.print("Item 2: ");
        String[] item2 = sc.nextLine().trim().split("-");
        String nameItem2 = item2[0];
        double itemPrice2 = Double.parseDouble(item2[1]);
        order.addItem(nameItem2, itemPrice2);

        System.out.println("\n" + order);

        sc.close();
    }
}
