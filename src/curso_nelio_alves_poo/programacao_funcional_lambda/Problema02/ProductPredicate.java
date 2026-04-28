package curso_nelio_alves_poo.programacao_funcional_lambda.Problema02;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.00;
    }
}
