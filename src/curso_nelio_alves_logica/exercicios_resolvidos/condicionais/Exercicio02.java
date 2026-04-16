package curso_nelio_alves_logica.exercicios_resolvidos.condicionais;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int menor = Math.min(n1, Math.min(n2, n3));

        System.out.println("MENOR = " + menor);

        sc.close();
    }
}
