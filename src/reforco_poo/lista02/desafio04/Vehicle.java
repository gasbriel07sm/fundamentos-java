package reforco_poo.lista02.desafio04;

public abstract class Vehicle {

    private String plate;
    private String brand;
    private String model;
    private Double basePrice;
    private VehicleColor color;
    private int yearManuf;

    public Vehicle(String plate, String brand, String model, Double basePrice, VehicleColor color, int yearManuf) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
        this.color = color;
        this.yearManuf = yearManuf; // ano de fabricação
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }

    public int getYearManuf() {
        return yearManuf;
    }

    public void setYearManuf(int yearManuf) {
        this.yearManuf = yearManuf;
    }

    public abstract double finalPrice();
    public abstract String vehicleTag();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vehicleTag());
        return sb.toString();
    }
}
