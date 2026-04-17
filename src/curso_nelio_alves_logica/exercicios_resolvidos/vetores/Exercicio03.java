package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}
