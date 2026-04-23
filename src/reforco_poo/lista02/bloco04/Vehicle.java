package reforco_poo.lista02.bloco04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public abstract class Vehicle {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String plate;
    private String brand;
    private String model;
    private List<Maintenance> maintenance;

    public Vehicle(String plate, String brand, String model, List<Maintenance> maintenances) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.maintenance = maintenances;
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

    public void addMaintenance(Maintenance maintenance) {
        this.maintenance.add(maintenance);
    }

    public Double totalMaintenanceCost() {
        double total = 0;
        for (Maintenance m : maintenance) {
            total += m.getCost();
        }
        return total;
    }

    public LocalDate latestMaintenance() {
        return maintenance.stream()
                .map(Maintenance::getDate)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }

    public abstract String vehicleType();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vehicleType());
        sb.append("\nMaintenances: " + maintenance.size());
        sb.append("\nLatest: " + latestMaintenance().format(dtf));
        sb.append("\nTotal cost: $ " + String.format("%.2f", totalMaintenanceCost()));
        return sb.toString();
    }
}
