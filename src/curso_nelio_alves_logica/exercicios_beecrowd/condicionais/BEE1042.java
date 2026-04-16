package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = Math.max(n1, Math.max(n2, n3));
        int menor = Math.min(n1, Math.min(n2, n3));
        int meio = (n1 + n2 + n3) - (maior + menor);

        System.out.print(menor + "\n" + meio + "\n" + maior + "\n");
        System.out.print("\n" + n1 + "\n" + n2 + "\n" + n3 + "\n");

        sc.close();
    }
}
