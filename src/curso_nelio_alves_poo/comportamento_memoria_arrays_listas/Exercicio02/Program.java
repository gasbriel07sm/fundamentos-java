package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> lista = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("\nEmployee %d: %n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();

            while (hasId(lista, id)) {
                System.out.println("ID já existente! Digite outro ID: ");
                id = sc.nextInt();
            }

            sc.nextLine(); // quebra de linha pendente

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            lista.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        if (hasId(lista, id)) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            for (Employee emp : lista) {
                if (emp.getId() == id) {
                    emp.increaseSalary(percentage);
                    break;
                }
            }

        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees: ");
        for (Employee e : lista) {
            System.out.println(e);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        for (Employee emp : list) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }
}

