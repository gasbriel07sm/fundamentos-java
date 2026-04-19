package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.vetores.Exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] genero = new char[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Altura da %dº pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Gênero da %dº pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        double somaAlturaMul = 0;
        int totalHomem = 0;
        int totalMulher = 0;

        for (int i = 0; i < N; i++) {
            if (genero[i] == 'M' || genero[i] == 'm') {
                totalHomem++;
            } else {
                somaAlturaMul += altura[i];
                totalMulher++;
            }

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        double mediaAlturaMulheres = somaAlturaMul / totalMulher;

        System.out.printf("\nMenor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Média altura das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.println("Número de homens: " + totalHomem);

        sc.close();
    }
}
