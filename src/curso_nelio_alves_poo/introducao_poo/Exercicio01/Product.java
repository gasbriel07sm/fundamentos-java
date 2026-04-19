package curso_nelio_alves_poo.introducao_poo.Exercicio01;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        }
    }

    public void removeProducts(int quantity) {
       if (quantity > 0) {
           this.quantity -= quantity;
       } else {
           System.out.println("Insufficient stock\n");
       }
    }

    @Override
    public String toString() {
        return name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalValueInStock();
    }
}
