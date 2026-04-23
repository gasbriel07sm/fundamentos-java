package reforco_poo.lista02.bloco06;

public enum Priority {

    LOW(72),
    MEDIUM(24),
    HIGH(8),
    CRITICAL(2);

    private final int slaHours;

    Priority(int slaHours) {
        this.slaHours = slaHours;
    }

    public int getSlaHours() {
        return slaHours;
    }
}
