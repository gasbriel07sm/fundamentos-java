package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome =  sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        // 15% de comissão sob as vendas

        double totalRecebido = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalRecebido);

        sc.close();
    }
}
