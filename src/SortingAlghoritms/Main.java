package SortingAlghoritms;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[4];

        students[0] = new Student("Luis Francisco", LocalDate.of(1998,1,26),95);
        students[1] = new Student("Jesus Ivan", LocalDate.of(2004,4,16),80);
        students[2] = new Student("Pedro Alfonso", LocalDate.of(1992,1,7), 90);
        students[3] = new Student("Beatriz", LocalDate.of(2004,3,19), 82);

        System.out.println("Students Before sorting");
        for (Student student : students) {
            System.out.println(student);
        }
        Sorting.bubbleSort(students);
        System.out.println("Students After sorting");
        for(Student student : students) {
            System.out.println(student);
        }


    }
}
