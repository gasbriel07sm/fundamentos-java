package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int nota = 0;

        System.out.println(valor);
        nota = 100;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
        valor %= nota;

        nota = 50;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
        valor %= nota;

        nota = 20;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
        valor %= nota;

        nota = 10;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
        valor %= nota;

        nota = 5;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
        valor %= nota;

        nota = 2;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);
        valor %= nota;

        nota = 1;
        System.out.printf("%d nota(s) de R$ %d,00\n", valor / nota, nota);

        sc.close();
    }
}
