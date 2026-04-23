package reforco_poo.lista02.desafio02;

public class BluRay extends Media {

    private static final double DAILY_RATE = 15.00;

    public BluRay(String title, Genre genre, int durationMinutes) {
        super(title, genre, durationMinutes);
    }

    @Override
    public double dailyRate() {
        return DAILY_RATE;
    }

    @Override
    public String mediaType() {
        return "Blu-ray";
    }

}
