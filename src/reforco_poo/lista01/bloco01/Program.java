package reforco_poo.lista01.bloco01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();

        System.out.print("Tank capacity (L): ");
        double tankCapacity = sc.nextDouble();

        System.out.print("Distance traveled (km): ");
        double distanceTraveled = sc.nextDouble();

        System.out.print("Fuel used (L): ");
        double fuelUsed = sc.nextDouble();

        Vehicle vehicle = new Vehicle(model, year, tankCapacity, distanceTraveled, fuelUsed);

        System.out.println("\n" + vehicle.toString());

        sc.close();
    }
}
