package reforco_poo.lista02.bloco04;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
        List<Vehicle> list = new ArrayList<>();

        System.out.print("Vehicles: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nVehicle #%d: %n", i);

            System.out.print("Truck or Van? (t/v) ");
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));

            System.out.print("Plate: ");
            String plate = sc.nextLine();

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            List<Maintenance> maintenances = new ArrayList<>();

            System.out.print("Maintenances: ");
            int maintenance = sc.nextInt();
            sc.nextLine(); // buffer

            for (int j = 1; j <= maintenance ; j++) {
                System.out.println("Maintenance #" + j + ":");

                System.out.print("Date: ");
                LocalDate date = LocalDate.parse(sc.next(), dtf);
                sc.nextLine(); // buffer

                System.out.print("Description: ");
                String description = sc.nextLine();

                System.out.print("Cost: ");
                double cost = sc.nextDouble();
                sc.nextLine(); // buffer

                maintenances.add(new Maintenance(date, description, cost));
            }

            if (ch == 't') {
                System.out.print("Tons: ");
                double tons =  sc.nextDouble();
                sc.nextLine();

                list.add(new Truck(plate, brand, model, maintenances, tons));
            } else {
                System.out.print("Seats: ");
                int seats = sc.nextInt();
                sc.nextLine();

                list.add(new Van(plate, brand, model, maintenances, seats));
            }
        }

        System.out.println("\nFLEET REPORT: ");
        double totalMaintenance = 0;

        for (Vehicle v : list) {
            System.out.println(v);
            System.out.println();

            totalMaintenance += v.totalMaintenanceCost();
        }

        System.out.printf("\nFLEET TOTAL MAINTENANCE COST: $ %.2f%n",  totalMaintenance);

        sc.close();
    }
}
