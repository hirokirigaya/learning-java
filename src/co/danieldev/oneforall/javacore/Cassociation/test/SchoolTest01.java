package co.danieldev.oneforall.javacore.Cassociation.test;

import co.danieldev.oneforall.javacore.Cassociation.domain.Professor;
import co.danieldev.oneforall.javacore.Cassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor("Jiraya");
        Professor prof2 = new Professor("Kakashi");

        Professor[] professors = {prof, prof2};

        School school = new School("Konoha", professors);

        school.print();
    }
}
