package curso_nelio_alves_logica.exercicios_resolvidos.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[][] mat = new double[N][N];
        double somaPos = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextDouble();

                if (mat[i][j] > 0) {
                    somaPos += mat[i][j];
                }
            }
        }
        int linha = sc.nextInt();
        int coluna = sc.nextInt();


        System.out.printf("Soma dos positivos: %.2f%n", somaPos);

        System.out.print("Linha escolhida: ");
        for (int i = 0; i < N; i++) {
            System.out.print(mat[linha][i] + " ");
        }

        System.out.print("\nColuna escolhida: ");
        for (int i = 0; i < N; i++) {
            System.out.print(mat[i][coluna] + " ");
        }

        System.out.print("\nDiagonal principal: ");
        for (int i = 0; i < N; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\nMatriz Alterada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }



        sc.close();
    }
}
