package curso_nelio_alves_poo.programacao_funcional_lambda.Problema03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("tablet", 350.50));
        list.add(new Product("hd case", 80.90));

//        list.forEach(new ProductConsumer());
//        list.forEach(Product::staticPriceUpdate);
//        list.forEach(Product::nonStaticPriceUpdate);

//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);
    }
}
