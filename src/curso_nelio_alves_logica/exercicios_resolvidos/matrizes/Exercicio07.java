package curso_nelio_alves_logica.exercicios_resolvidos.matrizes;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt();

        int ultimoElemento = mat[fila - 1][N - 1];
        for (int j = N - 1; j > 0; j--) {
            mat[fila - 1][j] = mat[fila - 1][j - 1];
        }
        mat[fila - 1][0] = ultimoElemento;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
