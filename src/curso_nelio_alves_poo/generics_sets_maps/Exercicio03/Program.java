package curso_nelio_alves_poo.generics_sets_maps.Exercicio03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> votos = new TreeMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                int voteCount = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)) {
                    int currentVotes = votos.get(name);
                    votos.put(name, currentVotes + voteCount);
                } else {
                    votos.put(name, voteCount);
                }
                line = br.readLine();
            }

            for (String key: votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
