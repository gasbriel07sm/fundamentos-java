package curso_nelio_alves_logica.exercicios_beecrowd.estrutura_sequencial;

import java.util.Scanner;

public class BEE1061 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.next();
        int diaIn = sc.nextInt();

        int horaIn = sc.nextInt();
        sc.next();
        int minutoIn = sc.nextInt();
        sc.next();
        int segundoIn = sc.nextInt();

        sc.next();
        int diaFin = sc.nextInt();

        int horaFin = sc.nextInt();
        sc.next();
        int minutoFin = sc.nextInt();
        sc.next();
        int segundoFin = sc.nextInt();

        int total = (diaFin * 86400 + horaFin * 3600 + minutoFin * 60 + segundoFin)  - (diaIn * 86400 + horaIn * 3600 + minutoIn * 60 + segundoIn);

        System.out.printf("%d dia(s)%n", total / 86400);
        total %= 86400;
        System.out.printf("%d hora(s)%n", total / 3600);
        total %= 3600;
        System.out.printf("%d minuto(s)%n", total / 60);
        total %= 60;
        System.out.printf("%d segundo(s)%n", total);

        sc.close();
    }
}
