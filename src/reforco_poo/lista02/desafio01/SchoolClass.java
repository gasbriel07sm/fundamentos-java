package reforco_poo.lista02.desafio01;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private Language language;
    private Level level;
    List<Student> students = new ArrayList<>();

    public SchoolClass(Language language, Level level) {
        this.language = language;
        this.level = level;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void addStudents(Student s) {
        students.add(s);
    }

    public double classRevenue() {
        double sum = 0;
        for (Student s: students) {
            sum += s.monthlyFee();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCLASS: ").append(language).append(" - ").append(level).append("\n");
        for (Student s: students) {
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\nCLASS REVENUE: $ ").append(String.format("%.2f", classRevenue()));
        return sb.toString();
    }
}
