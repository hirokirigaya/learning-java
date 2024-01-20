package co.danieldev.oneforall.javacore.Tgenerics.service;


import co.danieldev.oneforall.javacore.Tgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));

    public Car retrieveAvailableCar() {
        System.out.println("Searching for any car available...");
        Car car = carsAvailable.remove(0);
        System.out.println("Renting the car: "+ car);
        System.out.println("Available cars to rent: " + carsAvailable);
        return car;
    }

    public void returnRentCar(Car car) {
        System.out.println("Returning the car: "+ car);
        carsAvailable.add(car);
        System.out.println("Available cars to rent: "+ carsAvailable);
    }
}
