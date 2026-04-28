package curso_nelio_alves_poo.programacao_funcional_lambda.Problema02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("tablet", 350.50));
        list.add(new Product("hd case", 80.90));

//        list.removeIf(new ProductPredicate());
//        list.removeIf(Product::staticProductPredicate);
//        list.removeIf(Product::nonStaticProductPredicate);

        Predicate<Product> pred = p -> p.getPrice() >= 100;
        list.removeIf(pred);

        for (Product p: list) {
            System.out.println(p);
        }
    }
}
