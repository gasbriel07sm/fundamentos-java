package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC = (C + maiorAB + Math.abs(C - maiorAB)) / 2;

        System.out.println(maiorABC + " eh o maior");

        sc.close();
    }
}
