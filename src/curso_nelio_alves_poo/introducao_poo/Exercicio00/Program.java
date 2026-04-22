package curso_nelio_alves_poo.introducao_poo.Exercicio00;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the measures of triangle X: ");
        Triangle x = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter the measures of triangle Y: ");
        Triangle y =  new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("\nTriangle X area: " + String.format("%.2f",x.area()));
        System.out.println("Triangle Y area: " + String.format("%.2f",y.area()));

        if (x.area() > y.area()) {
            System.out.println("Larger area: X");
        } else if (x.area() < y.area()) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Equals area");
        }


        sc.close();
    }
}
