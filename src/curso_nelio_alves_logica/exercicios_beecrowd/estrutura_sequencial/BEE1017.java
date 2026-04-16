package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia =  sc.nextInt();

        int distancia = velocidadeMedia * tempoGasto;
        double litros = (double) distancia / 12;

        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
