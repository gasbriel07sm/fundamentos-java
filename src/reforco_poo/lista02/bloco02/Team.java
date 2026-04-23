package reforco_poo.lista02.bloco02;

public class Team extends Participant {

    private Integer memberCount;

    public Team(String name, Category category, Double valuePerMatch, Integer wins, Integer memberCount) {
        super(name, category, valuePerMatch, wins);
        this.memberCount = memberCount;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    @Override
    public Double prizePool() {
        return (getValuePerMatch() * getWins()) * (memberCount * 0.8);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getName() + " [" + getCategory() + " / Team] - $ ");
        sb.append(String.format("%.2f", prizePool()));

        return sb.toString();
    }
}
