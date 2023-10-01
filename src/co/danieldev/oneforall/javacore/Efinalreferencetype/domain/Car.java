package co.danieldev.oneforall.javacore.Efinalreferencetype.domain;

public class Car {
    private String name;
    public final double MAX_SPEED = 250.00;
    public final Buyer BUYER = new Buyer();

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
