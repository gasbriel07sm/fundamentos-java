package curso_nelio_alves_poo.interfaces.Problema03;

import curso_nelio_alves_poo.interfaces.Problema03.entities.ComboDevice;
import curso_nelio_alves_poo.interfaces.Problema03.entities.ConcretePrinter;
import curso_nelio_alves_poo.interfaces.Problema03.entities.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("MyLetter");
        p.print("MyLetter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("MyEmail");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
