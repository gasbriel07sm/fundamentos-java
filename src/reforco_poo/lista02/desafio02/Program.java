package reforco_poo.lista02.desafio02;

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
        List<Rental> rentalList = new ArrayList<>();

        System.out.print("Rentals: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Rental #%d: %n", i);

            System.out.println("==== MEDIA ====");

            System.out.print("DVD ou BluRay? (d/b): ");
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));

            System.out.print("Media Title: ");
            String title = sc.nextLine();

            System.out.print("Media Genre: ");
            Genre genre = Genre.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Durations in minutes: ");
            int durationMinutes = Integer.parseInt(sc.nextLine());

            Media media;

            if (ch == 'd') {
                media = new DVD(title, genre, durationMinutes);
            } else {
                media = new BluRay(title, genre, durationMinutes);
            }

            System.out.println("\n==== CUSTOMER ====");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            Customer customer = new Customer(name, cpf);

            System.out.println("\n==== DATES ====");

            System.out.print("Rental Date: ");
            LocalDate rentalDate = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Due Date: ");
            LocalDate dueDate = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Returned? (y/n): ");
            char returned = Character.toLowerCase(sc.nextLine().charAt(0));

            LocalDate returnDate = null;
            if (returned == 'y') {
                System.out.print("Return Date: ");
                returnDate = LocalDate.parse(sc.nextLine(), dtf);
            }

            rentalList.add(new Rental(media, customer, rentalDate, dueDate, returnDate));
        }

        System.out.println("\n=== RENTAL REPORT ===");
        for (Rental r: rentalList) {
            System.out.println(r);
            System.out.println();
        }

        sc.close();
    }
}
