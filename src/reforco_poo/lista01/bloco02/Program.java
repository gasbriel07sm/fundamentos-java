package reforco_poo.lista01.bloco02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Movie: ");
        String movieTitle = sc.nextLine();

        System.out.print("VIP session (true/false): ");
        boolean vipSession = sc.nextBoolean();

        System.out.print("Base price: ");
        double basePrice = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Ticket ticket = new Ticket(movieTitle, vipSession, basePrice, quantity);

        System.out.println("\n" + ticket.toString());

        sc.close();
    }
}
