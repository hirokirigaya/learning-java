package co.danieldev.oneforall.javacore.Cassociation.domain;


public class Seminar {

    private String title;
    private Student[] students;
    private Place place;


    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title,Place place, Student[] students) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public void print() {
        System.out.println("Title seminar: ");
        System.out.println(title);
        System.out.println("Place: ");
        System.out.println(place.getAddress());
        if (students != null) {
            System.out.println("Students: ");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
