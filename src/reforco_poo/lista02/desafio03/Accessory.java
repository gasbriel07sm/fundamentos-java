package reforco_poo.lista02.desafio03;

public class Accessory extends Product {

    private AccessoryType type;

    public Accessory(String name, Double price, Integer stock, AccessoryType type) {
        super(name, price, stock);
        this.type = type;
    }

    @Override
    public String productLabel() {
        return String.format("[Accessory/%s] %s", type, getName());
    }
}
