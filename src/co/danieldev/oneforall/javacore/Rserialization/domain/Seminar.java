package co.danieldev.oneforall.javacore.Rserialization.domain;

public class Seminar {
    private String name;

    @Override
    public String toString() {
        return "Seminar{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seminar(String name) {
        this.name = name;
    }
}
