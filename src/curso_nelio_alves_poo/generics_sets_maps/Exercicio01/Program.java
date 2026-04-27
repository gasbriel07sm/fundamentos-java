package curso_nelio_alves_poo.generics_sets_maps.Exercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("File path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<Person> listSet = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                listSet.add(new Person(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }

            System.out.println("Total users: " + listSet.size());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
