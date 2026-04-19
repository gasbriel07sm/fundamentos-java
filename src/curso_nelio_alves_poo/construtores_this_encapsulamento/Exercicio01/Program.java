package curso_nelio_alves_poo.construtores_this_encapsulamento.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc =  new Account();

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine(); // quebra de linha pendente
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char op =  sc.next().charAt(0);

        if (op == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();

            acc = new Account(numberAccount, holder, amount);
        } else {
            acc = new Account(numberAccount, holder);
        }

        System.out.println("\nAccount data: ");
        System.out.println(acc.toString());

        System.out.print("\nEnter a deposit value: ");
        acc.deposit(sc.nextDouble());

        System.out.println("\nUpdated account data:");
        System.out.println(acc.toString());

        System.out.print("\nEnter a withdraw value: ");
        acc.withdraw(sc.nextDouble());

        System.out.println("\nUpdated account data:");
        System.out.println(acc.toString());

        sc.close();
    }
}
