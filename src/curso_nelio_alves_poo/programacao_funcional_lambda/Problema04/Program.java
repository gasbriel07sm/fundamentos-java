package curso_nelio_alves_poo.programacao_funcional_lambda.Problema04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("tablet", 350.50));
        list.add(new Product("hd case", 80.90));

        // map aplica uma função a todos os elementos de uma stream (conjunto de dados)

//        List<String> names = list.stream().map(new ProductFunction()).toList();
//        List<String> names = list.stream().map(Product::staticUpperCaseName).toList();
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();

//        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();
        names.forEach(System.out::println);

        // stream para list -> .collect(Collectors.toList());

    }
}
