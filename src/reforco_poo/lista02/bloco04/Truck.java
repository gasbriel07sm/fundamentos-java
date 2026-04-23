package reforco_poo.lista02.bloco04;

import java.util.List;

public class Truck extends Vehicle {

    private Double capacityTons;

    public Truck(String plate, String brand, String model, List<Maintenance> maintenances, Double capacityTons) {
        super(plate, brand, model, maintenances);
        this.capacityTons = capacityTons;
    }

    public Double getCapacityTons() {
        return capacityTons;
    }

    public void setCapacityTons(Double capacityTons) {
        this.capacityTons = capacityTons;
    }

    @Override
    public String vehicleType() {
        return "[TRUCK] " + getPlate() + " — " + getBrand() + " " + getModel()
                + " (" + String.format("%.1f", capacityTons) + " tons)";
    }
}
