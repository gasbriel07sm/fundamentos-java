package curso_nelio_alves_poo.manipulacao_arquivo;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // criando um objeto File do arquivo original
        File sourceFile = new File(filePath);
        // pega apenas a pasta que o arquivo esta
        String sourceFolderStr = sourceFile.getParent();

        // criou a subpasta
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        // caminhofinal onde o arquivo será criado
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))
        ) {
            String line = br.readLine();

            while (line != null) {
                String[] dataLine = line.split(",");

                for (int i = 0; i < dataLine.length; i++) {
                    dataLine[i] = dataLine[i].trim().replace("\"", "");
                }

                String name = dataLine[0];
                double price = Double.parseDouble(dataLine[1]);
                int quantity = Integer.parseInt(dataLine[2]);

                double total = price * quantity;

                bw.write(name + "," + String.format("%.2f", total));
                bw.newLine();

                line = br.readLine();
            }

            System.out.println("Summary file created successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
