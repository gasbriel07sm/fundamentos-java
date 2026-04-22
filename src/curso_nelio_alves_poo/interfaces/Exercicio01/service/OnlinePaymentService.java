package curso_nelio_alves_poo.interfaces.Exercicio01.service;

public interface OnlinePaymentService {

    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
