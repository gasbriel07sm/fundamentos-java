package reforco_poo.lista02.bloco04;

import java.util.List;

public class Van extends Vehicle {

    private Integer passengerSeats;

    public Van(String plate, String brand, String model, List<Maintenance> maintenances, Integer passengerSeats) {
        super(plate, brand, model, maintenances);
        this.passengerSeats = passengerSeats;
    }

    public Integer getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(Integer passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String vehicleType() {
        return "[VAN] " + getPlate() + " — " + getBrand() + " " + getModel()
                + " (" + passengerSeats + " seats)";
    }
}
