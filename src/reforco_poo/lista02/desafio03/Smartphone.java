package reforco_poo.lista02.desafio03;

public class Smartphone extends Product {

    private String brand;
    private int storageGB;

    public Smartphone(String name, Double price, Integer stock, String brand, int storageGB) {
        super(name, price, stock);
        this.brand = brand;
        this.storageGB = storageGB;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    @Override
    public String productLabel() {
        return "[Smartphone] " + getName() + " " + brand + " " + storageGB + "GB";
    }
}
