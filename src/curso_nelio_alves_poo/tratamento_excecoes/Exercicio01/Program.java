package curso_nelio_alves_poo.tratamento_excecoes.Exercicio01;

import curso_nelio_alves_poo.tratamento_excecoes.Exercicio01.entities.Account;
import curso_nelio_alves_poo.tratamento_excecoes.Exercicio01.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = Integer.parseInt(sc.nextLine());

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);

            System.out.printf("New Balance: %.2f", acc.getBalance());
        }
        catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
