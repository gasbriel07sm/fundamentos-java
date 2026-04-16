package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class BEE1060 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalPos = 0;

        for (int i = 1; i <= 6; i++) {
            double num = sc.nextDouble();

            if (num > 0) {
                totalPos++;
            }
        }

        System.out.println(totalPos + " valores positivos");

        sc.close();
    }
}
