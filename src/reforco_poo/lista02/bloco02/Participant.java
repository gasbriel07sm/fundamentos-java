package reforco_poo.lista02.bloco02;

public abstract class Participant {

    private String name;
    private Category category;
    private Double valuePerMatch;
    private Integer wins;

    public Participant(String name, Category category, Double valuePerMatch, Integer wins) {
        this.name = name;
        this.category = category;
        this.valuePerMatch = valuePerMatch;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getValuePerMatch() {
        return valuePerMatch;
    }

    public Integer getWins() {
        return wins;
    }

    public abstract Double prizePool();
}
