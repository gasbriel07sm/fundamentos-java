package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double raio = sc.nextDouble();

        double A = PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
