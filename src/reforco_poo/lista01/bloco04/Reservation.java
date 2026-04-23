package reforco_poo.lista01.bloco04;

public class Reservation {

    private String guestName;
    private String roomCategory;
    private int nights;
    private double nightlyRate;

    public Reservation(String guestName, String roomCategory, int nights) {
        this.guestName = guestName;
        this.roomCategory = roomCategory;
        this.nights = nights;
        this.nightlyRate = defineNightlyRate(roomCategory);
    }

    public Reservation(String guestName, String roomCategory) {
        this(guestName, roomCategory, 1);
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public int getNights() {
        return nights;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    private double defineNightlyRate(String roomCategory) {
        switch (roomCategory) {
            case "Standard":
                return 150.0;
            case "Luxo":
                return 250.0;
            case "Suite":
                return 450.0;
            default:
                return 0.0;
        }
    }

    public double totalCost() {
        return getNightlyRate() * this.nights;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Reservation: " + guestName + "\n");
        sb.append("Category: " + roomCategory + "\n");
        sb.append("Nights: " + nights + "\n");
        sb.append("Rate: $ " + String.format("%.2f", getNightlyRate()) + "/night \n");
        sb.append("Total: $ " + String.format("%.2f", totalCost()) + "\n");
        return sb.toString();
    }
}
