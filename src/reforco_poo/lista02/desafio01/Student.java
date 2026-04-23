package reforco_poo.lista02.desafio01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Student {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String name;
    private String email;
    private LocalDate enrollmentDate;
    private static int totalEnrollments = 0;

    public Student(String name, String email, LocalDate enrollmentDate) {
        this.name = name;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
        totalEnrollments++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public static int getTotalEnrollments() {
        return totalEnrollments;
    }

    public static void setTotalEnrollments(int totalEnrollments) {
        Student.totalEnrollments = totalEnrollments;
    }

    public abstract double monthlyFee();

    public long monthsEnrolled() {
        return ChronoUnit.MONTHS.between(enrollmentDate, LocalDate.now());
    }
}
