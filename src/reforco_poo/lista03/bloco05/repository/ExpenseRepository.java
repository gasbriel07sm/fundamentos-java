package reforco_poo.lista03.bloco05.repository;


import reforco_poo.lista03.bloco05.entities.Expense;
import reforco_poo.lista03.bloco05.exception.NumberFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {

    private String filePath;

    public ExpenseRepository(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Expense> loadAll() {
        List<Expense> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while (line != null) {
                try {
                    Expense expense = Expense.fromCsvLine(line);
                    list.add(expense);
                }
                catch (NumberFormatException | IllegalArgumentException e) {
                    System.out.println("Malformed line skipped: " + line);
                }

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

    public void append(Expense expense) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(expense.toCsvLine());
            bw.newLine();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
