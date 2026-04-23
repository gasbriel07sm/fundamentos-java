package reforco_poo.lista02.desafio04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        List<Vehicle> listV = new ArrayList<>(); // lista dos veiculos
        List<TestDriveAppointment> listM = new ArrayList<>(); // lista dos test drives

        System.out.print("Vehicles: ");
            int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nVehicle #%d: %n", i);

            System.out.print("New Vehicle or Used Vehicle? (n/u): ");
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));

            System.out.print("Plate: ");
            String plate = sc.nextLine();

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            System.out.print("Base price: ");
            double basePrice = Double.parseDouble(sc.nextLine());

            System.out.print("Color: ");
            VehicleColor color = VehicleColor.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Year: ");
            int yearsManuf = Integer.parseInt(sc.nextLine());


            if (ch == 'n') {
                System.out.print("Warranty Months: ");
                int warrantyMonths = Integer.parseInt(sc.nextLine());

                listV.add(new NewVehicle(plate, brand, model, basePrice, color, yearsManuf, warrantyMonths));
            } else {
                System.out.print("Mileage: ");
                int mileage = Integer.parseInt(sc.nextLine());

                System.out.print("Previous Owners: ");
                int previousOwners = Integer.parseInt(sc.nextLine());

                listV.add(new UsedVehicle(plate, brand, model, basePrice, color, yearsManuf, mileage, previousOwners));
            }
        }

        System.out.print("\nTest Drives: ");
        int m = Integer.parseInt(sc.nextLine());

        for (int j = 1; j <= m; j++) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            Customer c = new Customer(name, telefone);

            System.out.println("Available vehicles:");
            for (Vehicle v : listV) {
                System.out.println(v.getPlate() + " - " + v.getBrand() + " " + v.getModel());
            }

            System.out.print("Choose vehicle by plate: ");
            String plate = sc.nextLine();

            Vehicle selectedVehicle = listV.stream().filter(v -> v.getPlate().equalsIgnoreCase(plate)).findFirst().orElse(null);


            if (selectedVehicle == null) {
                System.out.println("Vehicle not found.");
            } else {
                System.out.println("Selected: " + selectedVehicle.getBrand() + " " + selectedVehicle.getModel());

                System.out.print("Scheduled at (dd/MM/yyyy HH:mm): ");
                LocalDateTime scheduledAt = LocalDateTime.parse(sc.nextLine(), dtf);

                boolean alreadyScheduled = listM.stream()
                        .anyMatch(a -> a.getVehicle().getPlate().equalsIgnoreCase(selectedVehicle.getPlate())
                        && a.getScheduledAt().toLocalDate().equals(scheduledAt.toLocalDate()));

                if (alreadyScheduled) {
                    System.out.println("This vehicle already has a test drive scheduled for this day.");
                } else {
                    listM.add(new TestDriveAppointment(c, selectedVehicle, scheduledAt));
                }
            }
        }
        System.out.println("\nSTOCK REPORTS: ");

        for (Vehicle v: listV) {
            System.out.println(v.toString());
        }

        System.out.print("\nReport date (dd/MM/yyyy): ");
        LocalDate reportDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("\nTEST DRIVES — " + reportDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ":");

        List<TestDriveAppointment> appointmentsToday = listM.stream()
                .filter(a -> a.getScheduledAt().toLocalDate().equals(reportDate))
                .toList();

        for (TestDriveAppointment t : appointmentsToday) {
            System.out.println(t);
        }

        System.out.println("\nTOTAL APPOINTMENTS TODAY: " + appointmentsToday.size());
        System.out.println("TOTAL APPOINTMENTS (ALL TIME): " + TestDriveAppointment.getTotalAppointments());
    }
}
