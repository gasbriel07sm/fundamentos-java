package reforco_poo.lista02.desafio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<SchoolClass> classes = new ArrayList<>();

        System.out.print("Classes: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("Class #%d: %n", i);

            System.out.print("Language: ");
            Language language = Language.valueOf(sc.nextLine());

            System.out.print("Level: ");
            Level level = Level.valueOf(sc.nextLine());

            SchoolClass schoolClass = new SchoolClass(language, level);

            System.out.print("Students in class: ");
            int qtdStudents = Integer.parseInt(sc.nextLine());

            for (int j = 1; j <= qtdStudents; j++) {
                System.out.println("Student #" + j + ":");

                System.out.print("Regular or Intensive? (r/i): ");
                char ch = Character.toLowerCase(sc.nextLine().charAt(0));

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("Enrollment date: ");
                LocalDate enrollmentDate = LocalDate.parse(sc.nextLine(), dtf);

                if (ch == 'r') {
                    System.out.print("Fixed monthly fee: ");
                    double fee = Double.parseDouble(sc.nextLine());
                    schoolClass.addStudents(new RegularStudent(name, email, enrollmentDate, fee));
                } else {
                    System.out.print("Hours per month: ");
                    int hours = Integer.parseInt(sc.nextLine());

                    System.out.print("Price per hour: ");
                    double price = Double.parseDouble(sc.nextLine());

                    schoolClass.addStudents(new IntensiveStudent(name, email, enrollmentDate, hours, price));
                }
            }
            classes.add(schoolClass);
        }

        double monthlyRevenue = 0.0;

        for (SchoolClass s: classes) {
            System.out.println(s.toString());
            monthlyRevenue += s.classRevenue();
        }
        System.out.println("\nTOTAL ENROLLMENTS: " + Student.getTotalEnrollments());
        System.out.printf("CLASS REVENUE: $ %.2f%n", monthlyRevenue);

        sc.close();
    }
}
