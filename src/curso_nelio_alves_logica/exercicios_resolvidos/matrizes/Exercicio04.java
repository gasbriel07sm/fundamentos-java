package curso_nelio_alves_logica.exercicios_resolvidos.matrizes;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int somaDiagonal = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i < j) somaDiagonal = somaDiagonal + mat[i][j];
            }
        }

        System.out.println(somaDiagonal);

        sc.close();
    }
}
