package curso_nelio_alves_poo.introducao_poo.Exercicio06;

public class CurrencyConverter {

    private static final double iof = 6.00;

    public static double amountReal(double dollarPrice, double amount){
        return dollarPrice * amount * (1 + (iof / 100));
    }
}

