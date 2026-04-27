package curso_nelio_alves_poo.generics_sets_maps.Problema06;

import java.util.HashSet;
import java.util.Set;

public class Program01 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3);
//        System.out.println(set.contains("Notebook"));

        for (String p: set) {
            System.out.println(p);
        }
    }
}
