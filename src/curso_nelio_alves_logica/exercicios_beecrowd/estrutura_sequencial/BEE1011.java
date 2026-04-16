package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double R = sc.nextDouble();

        double VOLUME = PI * Math.pow(R, 3) * (4.0/3);

        System.out.printf("VOLUME = %.3f%n", VOLUME);

        sc.close();
    }
}
