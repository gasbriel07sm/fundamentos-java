package reforco_poo.lista02.bloco01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Attendance> list = new ArrayList<>();

        System.out.print("Enter number of attendances: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nAttendance #%d: %n", i);
            System.out.print("Consultation or Surgery (c/s)? ");
            char c = Character.toLowerCase(sc.next().charAt(0));
            sc.nextLine(); // limpeza buffer

            System.out.print("Pet name: ");
            String name = sc.nextLine();

            System.out.print("Tutor: ");
            String tutor = sc.nextLine();

            System.out.print("Base value: ");
            double baseValue = sc.nextDouble();
            sc.nextLine(); // limpeza de buffer

            if (c == 'c') {
                list.add(new Consultation(name, tutor, baseValue));
            } else {
                System.out.print("Anesthesia (GENERAL/LOCAL): ");
                AnesthesiaType anesthesia = AnesthesiaType.valueOf(sc.next());

                list.add(new Surgery(name, tutor, baseValue, anesthesia));
            }
        }

        System.out.println("\nATTENDANCE REPORT: ");

        double totalRevenue = 0.0;
        for (Attendance a : list) {
            totalRevenue += a.totalValue();

            System.out.println(a.toString());
        }

        System.out.println("TOTAL REVENUE: $ " + String.format("%.2f", totalRevenue));
        sc.close();
    }
}
