package reforco_poo.lista02.bloco02;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Participant p;
        List<Participant> list = new ArrayList<>();

        System.out.print("Participants: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("\n#%d - Solo or Team (s/t)? ", i);
            char ch = Character.toLowerCase(sc.next().charAt(0));
            sc.nextLine(); // limpeza buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Category (AMATEUR/SEMI_PRO/PRO): ");
            Category category = Category.valueOf(sc.next().toUpperCase());
            sc.nextLine(); // limpeza buuffer

            System.out.print("Value per match: ");
            double value = sc.nextDouble();
            sc.nextLine(); // limpeza buffer

            System.out.print("Wins: ");
            int wins = sc.nextInt();
            sc.nextLine(); // limpeza buffer

            if (ch == 's') {
                p = new SoloPlayer(name, category, value, wins);
            } else {
                System.out.print("Members: ");
                int members = sc.nextInt();

                p = new Team(name, category, value, wins, members);
            }

            list.add(p);
        }

        Collections.sort(list, Comparator.comparingDouble(Participant::prizePool).reversed());

        System.out.println("\nPRIZE RANKING: ");

        double totalDistributed = 0.0;
        int i = 1;
        for (Participant participant : list) {
            System.out.println(i + ". " + participant);

            totalDistributed += participant.prizePool();
            i++;
        }

        System.out.printf("\nTOTAL DISTRIBUTED: $ %.2f%n", totalDistributed);

        sc.close();
    }
}
