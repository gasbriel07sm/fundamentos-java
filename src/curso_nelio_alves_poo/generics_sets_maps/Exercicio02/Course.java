package curso_nelio_alves_poo.generics_sets_maps.Exercicio02;

import java.util.Objects;

public class Course {

    private Student student;

    public Course(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(student, course.student);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(student);
    }
}
