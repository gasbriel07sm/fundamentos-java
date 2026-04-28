package curso_nelio_alves_poo.programacao_funcional_lambda.Problema04;

import java.util.function.Consumer;
import java.util.function.Function;

public class ProductFunction implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
