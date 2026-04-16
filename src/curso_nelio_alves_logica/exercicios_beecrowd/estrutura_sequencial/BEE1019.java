package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempo =  sc.nextInt();

        int hora = tempo / 3600;
        tempo %= 3600;

        int minuto = tempo / 60;
        tempo %= 60;

        int segundo = tempo % 60;

        System.out.printf("%d:%d:%d%n", hora, minuto, segundo);

        sc.close();
    }
}
