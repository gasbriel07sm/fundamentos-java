package reforco_poo.lista03.bloco06;


import reforco_poo.lista03.bloco06.entities.DigitalProduct;
import reforco_poo.lista03.bloco06.entities.PhysicalProduct;
import reforco_poo.lista03.bloco06.entities.Product;
import reforco_poo.lista03.bloco06.exception.ProductNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("File path: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split("\\|");
                String type = fields[0];
                String id = fields[1];
                String name = fields[2];
                double price = Double.parseDouble(fields[3]);

                if (type.equals("PHYSICAL")) {
                    double weightKg = Double.parseDouble(fields[4]);
                    String dimensions = fields[5];

                    list.add(new PhysicalProduct(id, name, price, weightKg, dimensions));
                } else {
                    double sizeMB = Double.parseDouble(fields[4]);
                    String platform = fields[5];

                    list.add(new DigitalProduct(id, name, price, sizeMB, platform));
                }
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            System.out.print("Deseja adicionar novos dados? (s/n) ");
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));

            if (ch == 'y') {
                Product p = null;
                System.out.print("Type (PHYSICAL/DIGITAL): ");
                String type = sc.nextLine().toUpperCase();

                System.out.print("ID: ");
                String id = sc.nextLine();

                System.out.println("NAME: ");
                String name = sc.nextLine();

                System.out.println("PRICE: ");
                double price = Double.parseDouble(sc.nextLine());

                switch (type) {
                    case "PHYSICAL":
                        System.out.print("WEIGHT:");
                        double weight = Double.parseDouble(sc.nextLine());

                        System.out.println("DIMENSIONS");
                        String dimensions = sc.nextLine();

                        p = new PhysicalProduct(id, name, price, weight, dimensions);
                        break;
                    case "DIGITAL":
                        System.out.print("Size MB:");
                        double sizeMB = Double.parseDouble(sc.nextLine());

                        System.out.println("Platform");
                        String platform = sc.nextLine();

                        p = new DigitalProduct(id, name, price, sizeMB, platform);
                        break;
                }
                list.add(p);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
                    bw.write(p.serialize());
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }

        System.out.print("Remove id: ");
        String removeId = sc.nextLine();

        Product productToRemove = null;

        for (Product p : list) {
            if (p.getId().equalsIgnoreCase(removeId)) {
                productToRemove = p;
                break;
            }
        }

        try {
            if (productToRemove == null) {
                throw new ProductNotFoundException(
                        "Product \"" + removeId + "\" not found."
                );
            }

            list.remove(productToRemove);

            System.out.println("✓ " + productToRemove.getName() + " removed.");
        }
        catch (ProductNotFoundException e) {
            System.out.println("✗ ProductNotFoundException:");
            System.out.println("  " + e.getMessage());
        }

        System.out.print("Search: ");
        String search = sc.nextLine().toLowerCase();

        for (Product p : list) {
            if (p.getName().toLowerCase().contains(search)) {
                System.out.printf("Found: %s — %s $ %.2f%n",
                        p.getId(),
                        p.getName(),
                        p.getPrice());
            }
        }




    }
}
