package co.danieldev.oneforall.javacore.Tgenerics.test;

import co.danieldev.oneforall.javacore.Tgenerics.domain.Car;
import co.danieldev.oneforall.javacore.Tgenerics.service.CarRentalService;

public class GenericClassesTest01 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();

        Car car = carRentalService.retrieveAvailableCar();
        System.out.println("Using the car for an entire month");
        carRentalService.returnRentCar(car);
    }
}
