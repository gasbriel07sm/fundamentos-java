package reforco_poo.lista01.bloco08;

public class Program {
    public static void main(String[] args) {

        Customer c1 = new Customer("Maria Silva", "maria@email.com");
        Customer c2 = new Customer("Carlos Neto", "carlos@email.com");
        Customer c3 = new Customer("Lucia Paz", "lucia@email.com");

        System.out.printf("Customer #%d - %s (%s)%n", c1.getId(), c1.getName(), c1.getEmail());
        System.out.printf("Customer #%d - %s (%s)%n", c2.getId(), c2.getName(), c2.getEmail());
        System.out.printf("Customer #%d - %s (%s)%n", c3.getId(), c3.getName(), c3.getEmail());

        System.out.println("Total customers registered: " + Customer.getTotalCustomers());
    }
}
