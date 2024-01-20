package co.danieldev.oneforall.javacore.Cassociation.test;

import co.danieldev.oneforall.javacore.Cassociation.domain.Place;
import co.danieldev.oneforall.javacore.Cassociation.domain.Professor;
import co.danieldev.oneforall.javacore.Cassociation.domain.Seminar;
import co.danieldev.oneforall.javacore.Cassociation.domain.Student;

public class ExerciseAssociation {
    public static void main(String[] args) {
        Place place = new Place("CEM 02");

        Seminar seminar = new Seminar("Capitalismo", place);
        Seminar seminar02 = new Seminar("Fauna e flora", place);
        Seminar[] seminars = { seminar, seminar02 };

        Professor prof = new Professor("Prof. Girafales");

        Student student = new Student("Chaves", seminar02);
        Student student02 = new Student("Kiko", seminar);
        Student student03 = new Student("Chiquinha", seminar);
        Student[] students = { student, student02, student03};


        prof.setSeminars(seminars);
        seminar.setStudents(students);

        seminar.print();
    }
}
