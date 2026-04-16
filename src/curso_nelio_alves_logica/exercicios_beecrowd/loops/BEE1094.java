package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Locale;
import java.util.Scanner;

public class BEE1094 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int totalCobaias = 0;
        int totalC = 0;
        int totalR = 0;
        int totalS = 0;

        for (int i = 1; i <= N; i++) {
            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);

            switch (tipo) {
                case 'C':
                    totalC += quantidade;
                    break;
                case 'R':
                    totalR += quantidade;
                    break;
                case 'S':
                    totalS += quantidade;
                    break;
            }
            totalCobaias += quantidade;
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.printf("Total de coelhos: %d%n", totalC);
        System.out.printf("Total de ratos: %d%n", totalR);
        System.out.printf("Total de sapos: %d%n", totalS);
        System.out.printf("Percentual de coelhos: %.2f %%%n",  ((double) totalC / totalCobaias) * 100);
        System.out.printf("Percentual de ratos: %.2f %%%n",  ((double) totalR / totalCobaias) * 100);
        System.out.printf("Percentual de sapos: %.2f %%%n",  ((double) totalS / totalCobaias) * 100);

        sc.close();
    }
}
