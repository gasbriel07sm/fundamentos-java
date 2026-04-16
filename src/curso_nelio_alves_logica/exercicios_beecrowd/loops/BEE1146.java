package curso_nelio_alves_logica.exercicios_beecrowd.loops;

import java.util.Scanner;

public class BEE1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int X = sc.nextInt();

            if (X == 0) {
                break;
            } else {
                for (int i = 1; i <= X; i++) {
                    if (i == X) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        }

        sc.close();
    }
}
