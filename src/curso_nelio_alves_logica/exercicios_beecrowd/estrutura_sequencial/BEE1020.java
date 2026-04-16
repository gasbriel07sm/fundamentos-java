package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = idade / 365;
        idade %= 365;

        int mes = idade / 30;
        idade %= 30;

        int dia = idade;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
