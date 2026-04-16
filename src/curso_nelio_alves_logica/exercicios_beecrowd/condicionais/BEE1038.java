package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double precoUni = 0;

        switch(codigo){
            case 1:
                precoUni = 4.00;
                break;
            case 2:
                precoUni = 4.50;
                break;
            case 3:
                precoUni = 5.00;
                break;
            case 4:
                precoUni = 2.00;
                break;
            case 5:
                precoUni = 1.50;
                break;
        }

        double precoTotal = precoUni * quantidade;

        System.out.printf("Total: R$ %.2f\n", precoTotal);

        sc.close();
    }
}
