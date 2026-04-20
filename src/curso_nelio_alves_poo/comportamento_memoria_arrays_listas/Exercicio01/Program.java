package curso_nelio_alves_poo.comportamento_memoria_arrays_listas.Exercicio01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();

        Quartos[]  quartos = new Quartos[10];

        for (int i = 0; i < N; i++) {
            sc.nextLine(); // quebra de linha pendente
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            quartos[room] = new Quartos(nome, email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.printf("%d: %s, %s%n", i, quartos[i].getNome(), quartos[i].getEmail());
            }
        }


        sc.close();
    }
}
