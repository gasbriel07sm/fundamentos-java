package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int i = 1;
        while (i <= 6) {
            if (X % 2 == 0) {
                X++;
                System.out.println(X);
            } else {
                System.out.println(X);
            }

            i++;
            X += 2;
        }

        sc.close();
    }
}
