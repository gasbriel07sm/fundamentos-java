package curso_nelio_alves_poo.introducao_poo.Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Circumference.circumference(radius));
        System.out.printf("Volume: %.2f%n", Circumference.volume(radius));
        System.out.printf("PI value: %.2f%n" + Math.PI);

        sc.close();
    }
}
