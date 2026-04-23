package reforco_poo.lista01.bloco06;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Wallet a = new Wallet("A", "Lucas", 200.00);
        Wallet b = new Wallet("B", "Marina", 50.00);

        System.out.printf("Wallet A (%s, R$ %.2f)", a.getHolderName(), a.getBalance());
        System.out.printf("| Wallet B (%s, R$ %.2f)%n", b.getHolderName(), b.getBalance());

        System.out.printf("%s deposits: ", a.getHolderName());
        a.deposit(sc.nextDouble());
        System.out.printf("%s transfers to %s: ", a.getHolderName(), b.getHolderName());
        a.transfer(b, sc.nextDouble());

        System.out.printf("\n%s withdraws: ", b.getHolderName());
        b.withdraw(sc.nextDouble());

        System.out.println("\nWallet A - " + a.toString());
        System.out.println("Wallet B - " + b.toString());

        sc.close();
    }
}
