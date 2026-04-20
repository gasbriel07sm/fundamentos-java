package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.Exercicio03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M =  sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == X) {
                    System.out.printf("Position %d,%d%n", i, j);

                    if (j > 0) {
                        System.out.printf("Left: %d%n", mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Up: %d%n", mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.printf("Right: %d%n", mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.printf("Down: %d%n", mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
