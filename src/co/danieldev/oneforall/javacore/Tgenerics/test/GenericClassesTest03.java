package co.danieldev.oneforall.javacore.Tgenerics.test;

import co.danieldev.oneforall.javacore.Tgenerics.domain.Boat;
import co.danieldev.oneforall.javacore.Tgenerics.domain.Car;
import co.danieldev.oneforall.javacore.Tgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

        RentalService<Car> carRentalService = new RentalService<>(carsAvailable);
        Car car = carRentalService.retrieveAvailableObject();
        System.out.println("Using the car an entire month...");
        carRentalService.returnRentObject(car);


        System.out.println("------------------");

        RentalService<Boat> boatRentalService = new RentalService<>(boatsAvailable);
        Boat boat = boatRentalService.retrieveAvailableObject();
        System.out.println("Using the boat an entire month...");
        boatRentalService.returnRentObject(boat);
    }
}
