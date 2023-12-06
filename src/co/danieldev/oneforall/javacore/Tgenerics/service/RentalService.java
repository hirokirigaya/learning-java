package co.danieldev.oneforall.javacore.Tgenerics.service;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objectsAvailable;

    public RentalService(List<T> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }

    public T retrieveAvailableObject() {
        System.out.println("Searching for any object available...");
        T object = objectsAvailable.remove(0);
        System.out.println("Renting the object: "+ object);
        System.out.println("Available objects to rent: " + objectsAvailable);
        return object;
    }

    public void returnRentObject(T object) {
        System.out.println("Returning the object: "+ object);
        objectsAvailable.add(object);
        System.out.println("Available objects to rent: "+ objectsAvailable);
    }
}
