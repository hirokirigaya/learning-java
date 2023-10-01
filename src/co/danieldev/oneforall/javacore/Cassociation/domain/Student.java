package co.danieldev.oneforall.javacore.Cassociation.domain;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Seminar seminar) {
        this.name = name;
        this.seminar = seminar;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
