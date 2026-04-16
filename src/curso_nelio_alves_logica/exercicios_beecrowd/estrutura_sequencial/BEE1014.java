package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // distância percorrida em km
        double Y = sc.nextDouble(); // valor real que é o total de combustível gasto

        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}
