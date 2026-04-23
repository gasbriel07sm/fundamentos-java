package reforco_poo.lista02.desafio02;

public class DVD extends Media {

    private static final double DAILY_RATE = 8.00;

    public DVD(String title, Genre genre, int durationMinutes) {
        super(title, genre, durationMinutes);
    }

    @Override
    public double dailyRate() {
        return DAILY_RATE;
    }

    @Override
    public String mediaType() {
        return "DVD";
    }
}
