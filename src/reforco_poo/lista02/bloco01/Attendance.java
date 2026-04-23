package reforco_poo.lista02.bloco01;

public abstract class Attendance {

    private String petName;
    private String tutorName;
    private Double baseValue;

    public Attendance(String petName, String tutorName, Double baseValue) {
        this.petName = petName;
        this.tutorName = tutorName;
        this.baseValue = baseValue;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    public abstract double totalValue();
}
