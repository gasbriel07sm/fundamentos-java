package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double temp;
        if (A < B) {
            temp = A;
            A = B;
            B = temp;
        }
        if (A < C) {
            temp = A;
            A = C;
            C = temp;
        }
        if (B < C) {
            temp = B;
            B = C;
            C = temp;
        }

        if (A >= B + C) {
            System.out.print("NAO FORMA TRIANGULO\n");
        } else {
            if (A * A == B * B + C * C) {
                System.out.print("TRIANGULO RETANGULO\n");
            } else if (A * A > B * B + C * C) {
                System.out.print("TRIANGULO OBTUSANGULO\n");
            } else if (A * A < B * B + C * C) {
                System.out.print("TRIANGULO ACUTANGULO\n");
            }

            if (A == B && A == C) {
                System.out.print("TRIANGULO EQUILATERO\n");
            } else if (A == B || B == C || A == C) {
                System.out.print("TRIANGULO ISOSCELES\n");
            }
        }

        sc.close();
    }
}
