package reforco_poo.lista02.bloco05;

public class MenuItem {

    private String name;
    private Double price;
    private Integer quantity;

    public MenuItem(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " $ " + String.format("%.2f", subTotal());
    }
}
