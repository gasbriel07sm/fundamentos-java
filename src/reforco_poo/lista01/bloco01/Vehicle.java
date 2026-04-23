package reforco_poo.lista01.bloco01;

public class Vehicle {

    private String model;
    private int year;
    private double tankCapacity;
    private double distanceTraveled;
    private double fuelUsed;

    public Vehicle(String model, int year, double tankCapacity, double distanceTraveled, double fuelUsed) {
        this.model = model;
        this.year = year;
        this.tankCapacity = tankCapacity;
        this.distanceTraveled = distanceTraveled;
        this.fuelUsed = fuelUsed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    public double avgConsumption() {
        return distanceTraveled / fuelUsed;
    }

    public double remainingRange() {
        return avgConsumption() * tankCapacity;
    }

    public boolean isEfficient() {
        return avgConsumption() > 12;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Vehicle: " + model + " (" + year + ")\n");
        s.append("Avg consumption: " + String.format("%.2f", avgConsumption()) + " km/L \n");
        s.append("Remaining range: " + String.format("%.2f", remainingRange()) + " km \n");
        s.append("Efficient: ").append(isEfficient() ? "YES" : "NO");

        return s.toString();
    }
}
