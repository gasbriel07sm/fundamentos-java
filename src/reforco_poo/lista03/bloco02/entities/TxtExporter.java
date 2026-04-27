package reforco_poo.lista03.bloco02.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TxtExporter implements ReportExporter {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public void export(List<Sale> sales, String filePath) {
        File folder = new File(filePath);
        folder.mkdirs();

        File file = new File(folder, "sales_report.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            bw.write(String.format("%-5s %-20s %-10s %-12s %-12s %-12s",
                    "ID", "PRODUCT", "QTY", "UNIT PRICE", "SUBTOTAL", "DATE"));
            bw.newLine();

            for (Sale sale : sales) {
                bw.write(String.format("%-5d %-20s %-10d %-12.2f %-12.2f %-12s",
                        sale.getId(),
                        sale.getProduct(),
                        sale.getQuantity(),
                        sale.getUnitPrice(),
                        sale.subtotal(),
                        sale.getDate().format(dtf)));
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String formatName() {
        return "File exported: sales_report.txt";
    }
}
