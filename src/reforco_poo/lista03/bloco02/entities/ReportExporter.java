package reforco_poo.lista03.bloco02.entities;

import java.util.List;

public interface ReportExporter {
    void export(List<Sale> sales, String filePath);
    String formatName();
}
