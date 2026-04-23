package reforco_poo.lista02.bloco06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        List<Ticket> list = new ArrayList<>();

        System.out.print("Tickets: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTicket #" + i + ":");

            System.out.print("Code: ");
            String code = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            Requester req = new Requester(name, email);

            System.out.print("Priority: ");
            Priority priority = Priority.valueOf(sc.nextLine());

            System.out.print("Status: ");
            TicketStatus status = TicketStatus.valueOf(sc.nextLine());

            System.out.print("Opened at: ");
            LocalDateTime openedAt = LocalDateTime.parse(sc.nextLine(), dtf);

            LocalDateTime closedAt = null;
            if (status == TicketStatus.CLOSED) {
                System.out.print("Closed at: ");
                closedAt = LocalDateTime.parse(sc.nextLine(), dtf);
            }

            list.add(new Ticket(code, req, priority, status, openedAt, closedAt));
        }

        System.out.println("\nRELATÓRIO DE TICKETS");
        for (Ticket t : list) {
            System.out.println(t.toString());
            System.out.println();
        }

        sc.close();
    }
}
