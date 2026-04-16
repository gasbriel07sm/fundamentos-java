package curso_nelio_alves_logica.exercicios_resolvidos.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorMetro = sc.nextDouble();

        double area = largura * comprimento;
        double precoTotal = area * valorMetro;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", precoTotal);

        sc.close();
    }
}
