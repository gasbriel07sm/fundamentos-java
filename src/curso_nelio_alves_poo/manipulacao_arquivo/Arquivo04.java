package curso_nelio_alves_poo.manipulacao_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo04 {
    public static void main(String[] args) {

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.getStackTrace();
        }

    }
}
