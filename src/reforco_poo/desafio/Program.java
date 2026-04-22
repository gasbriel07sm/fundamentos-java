package reforco_poo.desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Book: ");
        String isbn = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        Book book = new Book(isbn, title, author);

        System.out.print("Reader: ");
        String reader = sc.nextLine();

        System.out.print("Loan Date: ");
        LocalDate loanDate = LocalDate.parse(sc.nextLine(), dtf);

        Loan loan = new Loan(book, reader, loanDate);

        System.out.println("Loan registered: ");
        System.out.printf("Book: %s%n", book.getTitle());
        System.out.printf("Reader: %s%n", loan.getReaderName());
        System.out.printf("Date: %s%n", loan.getLoanDate().format(dtf));
        System.out.println("Status: " + (book.isAvailable() ? "AVAILABLE" : "UNAVAILABLE"));

        System.out.print("Days late on return: ");
        int daysLate = sc.nextInt();

        loan.returnBook(daysLate);

        System.out.println("\nReturn processed: ");
        System.out.printf("Late days: %d %n", daysLate);
        System.out.printf("Fine: $ %.2f%n", loan.lateFee(daysLate));
        System.out.println("Book status: " + (book.isAvailable() ? "AVAILABLE" : "UNAVAILABLE"));

        sc.close();
    }
}
