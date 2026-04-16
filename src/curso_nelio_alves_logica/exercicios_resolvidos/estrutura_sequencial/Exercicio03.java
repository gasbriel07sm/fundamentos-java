package curso_nelio_alves_logica.exercicios_resolvidos.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeP1 = sc.next();
        int idadeP1 = sc.nextInt();
        String nomeP2 = sc.next();
        int idadeP2 = sc.nextInt();

        double mediaIdades = (double) (idadeP1 + idadeP2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nomeP1, nomeP2, mediaIdades);

        sc.close();
    }
}
