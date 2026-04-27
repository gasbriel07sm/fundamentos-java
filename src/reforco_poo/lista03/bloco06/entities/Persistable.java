package reforco_poo.lista03.bloco06.entities;

public interface Persistable {
    String serialize();
    void deserialize(String line);
}
