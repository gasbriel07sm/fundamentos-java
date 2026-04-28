package curso_nelio_alves_poo.programacao_funcional_lambda.Exercicio01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("File path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            double sum = 0;
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
;            List<String> newList = list.stream()
                .filter(p -> p.getPrice() < avg)
                .map(p -> p.getName())
                .sorted(comp.reversed())
                .toList();

            System.out.println(Arrays.toString(newList.toArray()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
