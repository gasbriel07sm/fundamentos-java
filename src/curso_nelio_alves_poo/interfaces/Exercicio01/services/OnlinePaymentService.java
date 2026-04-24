package curso_nelio_alves_poo.interfaces.Exercicio01.services;

public interface OnlinePaymentService {

    double paymentFee(Double amount);
    double interest(Double amount, Integer months);
}
