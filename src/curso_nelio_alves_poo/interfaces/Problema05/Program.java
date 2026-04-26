package curso_nelio_alves_poo.interfaces.Problema05;

import curso_nelio_alves_poo.interfaces.Problema05.services.BrazilInterestService;
import curso_nelio_alves_poo.interfaces.Problema05.services.TaxService;
import curso_nelio_alves_poo.interfaces.Problema05.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        TaxService is = new BrazilInterestService(2.0);
        TaxService isU = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));
    }
}
