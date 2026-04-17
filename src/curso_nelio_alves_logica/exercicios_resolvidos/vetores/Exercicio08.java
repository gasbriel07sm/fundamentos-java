package curso_nelio_alves_logica.exercicios_resolvidos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] sexo = new char[N];

        double somaAlturaMulher = 0.0;
        int totalHomem = 0;
        int totalMulher = 0;

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double maiorAltura = altura[0];
        double menorAltura = altura[0];

        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F' || sexo[i] == 'f') {
                somaAlturaMulher += altura[i];
                totalMulher++;
            } else {
                totalHomem++;
            }

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        double mediaAltura = somaAlturaMulher / totalMulher;
        System.out.printf("MENOR ALTURA: %.2f%n",  menorAltura);
        System.out.printf("MAIOR ALTURA: %.2f%n",  maiorAltura);
        System.out.printf("MEDIA DAS ALTURAS DAS MULHERES: %.2f%n", mediaAltura);
        System.out.println("NUMERO DE HOMENS: " + totalHomem);

        sc.close();
    }
}
