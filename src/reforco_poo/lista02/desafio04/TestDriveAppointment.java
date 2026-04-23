package reforco_poo.lista02.desafio04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDriveAppointment {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private Customer customer;
    private Vehicle vehicle;
    private LocalDateTime scheduledAt;
    private static int totalAppointments = 0;

    public TestDriveAppointment(Customer customer, Vehicle vehicle, LocalDateTime scheduledAt) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.scheduledAt = scheduledAt;
        totalAppointments++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getScheduledAt() {
        return scheduledAt;
    }

    public static int getTotalAppointments() {
        return totalAppointments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(scheduledAt.format(dtf))
                .append(" | ").append(customer.getNome())
                .append(" -> ").append(vehicle.getBrand())
                .append(" ").append(vehicle.getModel())
                .append(" ").append(vehicle.getYearManuf());
        return sb.toString();
    }
}
