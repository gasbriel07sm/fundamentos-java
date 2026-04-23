package reforco_poo.lista02.desafio03;

public class Notebook extends Product {

    private String brand;
    private int ramGB;
    private String processor;

    public Notebook(String name, Double price, Integer stock, String brand, int ramGB, String processor) {
        super(name, price, stock);
        this.brand = brand;
        this.ramGB = ramGB;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String productLabel() {
        return "[Notebook] " + getName() + "  " + brand + " " + processor + " /" + ramGB + "GB";
    }
}
