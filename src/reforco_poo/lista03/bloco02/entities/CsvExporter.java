package reforco_poo.lista03.bloco02.entities;

import java.util.List;
import java.io.*;
import java.time.format.DateTimeFormatter;

public class CsvExporter implements ReportExporter {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public void export(List<Sale> sales, String filePath) {
        File folder = new File(filePath);
        folder.mkdirs();
        File file = new File(folder, "sales_report.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("id,product,quantity,unit_price,subtotal,date");
            for (Sale sale : sales) {
                bw.write(
                        sale.getId() + "," +
                        sale.getProduct() + "," +
                        sale.getQuantity() + "," +
                        String.format("%.2f", sale.getUnitPrice()) + "," +
                        String.format("%.2f", sale.subtotal()) + "," +
                        sale.getDate().format(dtf)
                );
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }

    @Override
    public String formatName() {
        return "File exported: sales_report.csv";
    }
}
