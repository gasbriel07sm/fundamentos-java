package curso_nelio_alves_poo.interfaces.Exercicio01.services;

import curso_nelio_alves_poo.interfaces.Exercicio01.entities.Contract;
import curso_nelio_alves_poo.interfaces.Exercicio01.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double amount = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double interest = onlinePaymentService.interest(amount, i);
            double paymentFee = onlinePaymentService.paymentFee(amount + interest);
            double total = paymentFee + interest + amount;
            LocalDate dueDate = contract.getDate().plusMonths(i);
        }
    }
}
