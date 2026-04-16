package curso_nelio_alves_logica.exercicios_beecrowd.condicionais;

import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaIn = sc.nextInt();
        int horaFin = sc.nextInt();
        int tempoTotal = 0;

        if (horaFin > horaIn) {
            tempoTotal = horaFin - horaIn;
        } else if (horaFin < horaIn) {
            tempoTotal = (24 - horaIn) + horaFin;
        } else {
            tempoTotal = 24;
        }

        System.out.println("O JOGO DUROU " + tempoTotal + " HORA(S)");

        sc.close();
    }
}
