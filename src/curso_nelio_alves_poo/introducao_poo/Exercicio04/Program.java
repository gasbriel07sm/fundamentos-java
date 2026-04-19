package curso_nelio_alves_poo.introducao_poo.Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double grade1 = sc.nextDouble();
        double grade2 = sc.nextDouble();
        double grade3 = sc.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.passedGrade() == 0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.passedGrade());
        }

        sc.close();
    }
}
