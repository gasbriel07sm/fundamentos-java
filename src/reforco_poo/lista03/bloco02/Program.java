package reforco_poo.lista03.bloco02;

import reforco_poo.lista03.bloco02.entities.CsvExporter;
import reforco_poo.lista03.bloco02.entities.Sale;
import reforco_poo.lista03.bloco02.entities.TxtExporter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Locale.setDefault(Locale.US);
        List<Sale> list = new ArrayList<>();
        CsvExporter csvExporter = new CsvExporter();
        TxtExporter txtExporter = new TxtExporter();

        String filePath = "C:\\Users\\Pagee\\Downloads\\teste";

        Sale s1 = new Sale(1, "Notebook Dell",2,4299.00, LocalDate.parse("2025-04-10", dtf));
        Sale s2 = new Sale(2,"Mouse Logitech",5,189.90, LocalDate.parse("2025-04-11", dtf));
        Sale s3 = new Sale(3,"Teclado Mecânico",1,459.00, LocalDate.parse("2025-04-12", dtf));
        Sale s4 = new Sale(4,"Monitor 27\"",3,1299.00, LocalDate.parse("2025-04-13", dtf));

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        csvExporter.export(list, filePath);

        System.out.println(csvExporter.formatName() + " (" + list.size() + " records)");
        System.out.println("Preview (first 5 lines):");

        File file = new File(filePath, "sales_report.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            int count = 0;

            while (line != null && count < 5) {
                System.out.println(line);
                line = br.readLine();
                count++;
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
