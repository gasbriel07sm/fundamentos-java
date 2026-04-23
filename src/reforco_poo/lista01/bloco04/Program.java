package reforco_poo.lista01.bloco04;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Reservation res;

        System.out.print("Guest: ");
        String guest = sc.nextLine();

        System.out.print("Room category: ");
        String category = sc.nextLine();

        System.out.print("Nights: ");
        String n =  sc.nextLine();

        if (n.isEmpty()) {
            res = new Reservation(guest, category);
        } else {
            int nights = Integer.parseInt(n);
            res = new Reservation(guest, category, nights);
        }

        System.out.println("\n" + res.toString());

        sc.close();
    }
}
