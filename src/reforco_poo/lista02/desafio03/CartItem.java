package reforco_poo.lista02.desafio03;

import java.util.ArrayList;
import java.util.List;

public class CartItem {

    private Product product;
    private Integer quantity;

    public CartItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double subtotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.productLabel()
                + "  x" + quantity
                + "  $ " + String.format("%.2f", subtotal()) + "\n";
    }
}
