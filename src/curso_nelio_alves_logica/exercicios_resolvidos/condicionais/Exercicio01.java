package curso_nelio_alves_logica.exercicios_resolvidos.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 =  sc.nextDouble();
        double n2 =  sc.nextDouble();

        double notaFinal = n1 + n2;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
