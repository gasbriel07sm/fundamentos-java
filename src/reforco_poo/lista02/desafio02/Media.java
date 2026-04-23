package reforco_poo.lista02.desafio02;

public abstract class Media {

    private String title;
    private Genre genre;
    private int durationMinutes;

    public Media(String title, Genre genre, int durationMinutes) {
        this.title = title;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public abstract double dailyRate();
    public abstract String mediaType();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Media: ").append(mediaType()).append(" ").append(getTitle());
        sb.append(" (").append(genre).append(" - ").append(getDurationMinutes()).append(" min)");
        sb.append("\n");
        return sb.toString();
    }
}
