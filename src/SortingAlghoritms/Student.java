package SortingAlghoritms;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
    private final String name;
    private final LocalDate birthDate;
    private final Integer grade;

    public Student(String name, LocalDate birthDate, Integer grade) {
        this.name = name;
        this.birthDate = birthDate;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
