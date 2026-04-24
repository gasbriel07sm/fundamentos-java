package curso_nelio_alves_poo.interfaces.Exercicio01;

import curso_nelio_alves_poo.interfaces.Exercicio01.entities.Contract;
import curso_nelio_alves_poo.interfaces.Exercicio01.entities.Installment;
import curso_nelio_alves_poo.interfaces.Exercicio01.services.ContractService;
import curso_nelio_alves_poo.interfaces.Exercicio01.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number, data, value);

        System.out.print("Entre com os números de parcelas: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());
        contractService.processContract(contract, months);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
