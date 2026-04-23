package reforco_poo.lista02.bloco03;

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
        List<Subscription> list = new ArrayList<>();

        System.out.print("Subscriptions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nSubscription #%d: %n", i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            Subscriber subscriber = new Subscriber(name, email);

            System.out.print("Plan (BASIC/STANDARD/PREMIUM): ");
            SubscriptionPlan plan = SubscriptionPlan.valueOf(sc.next().toUpperCase());
            sc.nextLine(); // limepza de buffer

            System.out.print("Start date (DD/MM/YYYY): ");
            LocalDate startDate = LocalDate.parse(sc.nextLine(), dtf);

            list.add(new Subscription(subscriber, plan, startDate));
        }

        System.out.println();

        for  (Subscription subscription : list) {
            System.out.println(subscription);
        }

        sc.close();
    }
}
