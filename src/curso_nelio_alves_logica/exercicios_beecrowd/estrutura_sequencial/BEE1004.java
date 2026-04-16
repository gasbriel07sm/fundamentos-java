package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int PROD = a * b;

        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
