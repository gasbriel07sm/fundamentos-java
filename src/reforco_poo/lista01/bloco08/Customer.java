package reforco_poo.lista01.bloco08;

public class Customer {

    private int id;
    private String name;
    private String email;
    public static int totalCustomers = 0;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = totalCustomers + 1;
        totalCustomers++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }
}
