package reforco_poo.lista02.bloco02;

public class SoloPlayer extends Participant {

    public SoloPlayer(String name, Category category, Double valuePerMatch, Integer wins) {
        super(name, category, valuePerMatch, wins);
    }

    @Override
    public Double prizePool() {
        return getValuePerMatch() * getWins();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getName() + " [" + getCategory() + " / Solo] - $ ");
        sb.append(String.format("%.2f", prizePool()));

        return sb.toString();
    }
}
