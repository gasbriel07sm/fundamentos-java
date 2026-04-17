package curso_nelio_alves_logica.exercicios_resolvidos.matrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            int maiorNumLinha = 0;
            for (int j = 0; j < N; j++) {
                if (mat[i][j] > maiorNumLinha) {
                    maiorNumLinha = mat[i][j];
                }
            }
            System.out.println(maiorNumLinha);
        }

        sc.close();
    }
}
