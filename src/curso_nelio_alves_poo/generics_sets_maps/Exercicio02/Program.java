package curso_nelio_alves_poo.generics_sets_maps.Exercicio02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Course> listSet = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int i = 1; i <= courseA; i++) {
            int cod = sc.nextInt();
            listSet.add(new Course(new Student(cod)));
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for (int i = 1; i <= courseB; i++) {
            int cod = sc.nextInt();
            listSet.add(new Course(new Student(cod)));
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for (int i = 1; i <= courseC; i++) {
            int cod = sc.nextInt();
            listSet.add(new Course(new Student(cod)));
        }

        System.out.println("Total students: " + listSet.size());

    }
}
