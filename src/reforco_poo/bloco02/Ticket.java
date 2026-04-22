package reforco_poo.bloco02;

public class Ticket {

    private String movieTitle;
    private boolean isVip;
    private double basePrice;
    private int quantity;

    public Ticket(String movieTitle, boolean isVip, double basePrice, int quantity) {
        this.movieTitle = movieTitle;
        this.isVip = isVip;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public boolean isVip() {
        return isVip;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String sessionType() {
        return isVip ? "VIP" : "NORMAL";
    }

    public double unitPrice() {
        return isVip ? basePrice * 1.4 : basePrice;
    }

    public double finalPrice() {
        return unitPrice() * quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Movie: ").append(movieTitle).append("\n");
        sb.append("Session: ").append(sessionType()).append("\n");
        sb.append("Unit price: $ ").append(String.format("%.2f", unitPrice())).append("\n");
        sb.append("Total: $ ").append(String.format("%.2f", finalPrice())).append("\n");

        return  sb.toString();
    }
}
