package reforco_poo.lista02.desafio04;

public class NewVehicle extends Vehicle {

    private int warrantyMonths; // garantia em meses

    public NewVehicle(String plate, String brand, String model, Double basePrice, VehicleColor color, int yearManuf, int warrantyMonths) {
        super(plate, brand, model, basePrice, color, yearManuf);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double finalPrice() {
        return getBasePrice();
    }

    @Override
    public String vehicleTag() {
        return String.format("""
                [NEW] %s | %s %s %d | %s
                Base: $ %.2f | Warranty: %d months
                Final price: $ %.2f
                """, getPlate(), getBrand(), getModel(), getYearManuf(), getColor()
                , getBasePrice(), getWarrantyMonths(), finalPrice());
    }
}
