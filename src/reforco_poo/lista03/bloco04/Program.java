package reforco_poo.lista03.bloco04;


import reforco_poo.lista03.bloco02.entities.ReportExporter;
import reforco_poo.lista03.bloco04.entities.EconomyFreight;
import reforco_poo.lista03.bloco04.entities.ExpressFreight;
import reforco_poo.lista03.bloco04.entities.Freight;
import reforco_poo.lista03.bloco04.entities.StandardFreight;
import reforco_poo.lista03.bloco04.enums.Modality;
import reforco_poo.lista03.bloco04.exceptions.FreightUnavailableException;
import reforco_poo.lista03.bloco04.exceptions.InvalidDistanceException;
import reforco_poo.lista03.bloco04.exceptions.InvalidWeightException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static reforco_poo.lista03.bloco04.enums.Modality.valueOf;

public class Program {
    private static Object weight;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Freight> list = new ArrayList<>();

        System.out.print("Freights: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("%nShipment #%d: %n", i);
            System.out.print("Mode (STANDARD/EXPRESS/ECONOMY): ");
            Modality modality = valueOf(sc.nextLine().toUpperCase());

            System.out.print("Weight (kg): ");
            double weight = Double.parseDouble(sc.nextLine());

            System.out.print("Distance (km): ");
            double distance = Double.parseDouble(sc.nextLine());

            try {
                Freight f;
                if (modality == Modality.ECONOMY) {
                    f = new Freight(new EconomyFreight(), modality);
                } else if (modality == Modality.STANDARD) {
                    f = new Freight(new StandardFreight(), modality);
                } else {
                    f = new Freight(new ExpressFreight(), modality);
                }

                f.getFreightCalculator().calculate(weight, distance);
                list.add(f);

                System.out.println("\nShipment #" + i + " [" + modality + "]: ");
                System.out.printf("Weight: %.2f%n", weight);
                System.out.printf("Distance: %.2f%n", distance);
                System.out.printf("FREIGHT: $ %.2f%n", f.getFreightCalculator().calculate(weight, distance));
            }
            catch (InvalidWeightException | FreightUnavailableException | InvalidDistanceException e) {
                System.out.println("\nShipment #" + i + " [" + modality.toString() + "]: ");
                System.out.println(e.getClass().getSimpleName() + ":\n" + e.getMessage());
            }
        }


    }
}
