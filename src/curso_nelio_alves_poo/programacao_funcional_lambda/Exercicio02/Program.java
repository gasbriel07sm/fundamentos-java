package curso_nelio_alves_poo.programacao_funcional_lambda.Exercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("File path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            List<Employee> list = new ArrayList<>();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.printf("\nEmail of people whose salary is more than %.2f: %n", salary);
            List<String> emailS = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .toList();
            emailS.forEach(System.out::println);

            System.out.print("\nEnter the letter: ");
            char letter = sc.next().toUpperCase().charAt(0);

            double sum = list.stream()
                    .filter(e -> e.getName().charAt(0) == letter)
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.printf("Sum of salary of people whose name starts with '%s': %.2f %n", letter, sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
