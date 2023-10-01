package co.danieldev.oneforall.javacore.Efinalreferencetype.test;

import co.danieldev.oneforall.javacore.Efinalreferencetype.domain.Car;

public class Car01 {
    public static void main(String[] args) {
        Car car = new Car("Volvo XC40");

        car.BUYER.setName("teste");
        System.out.println();
    }
}
