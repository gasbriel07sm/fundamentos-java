package curso_nelio_alves_poo.programacao_funcional_lambda.Problema01;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
