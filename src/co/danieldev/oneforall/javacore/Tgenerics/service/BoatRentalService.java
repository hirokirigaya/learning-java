package co.danieldev.oneforall.javacore.Tgenerics.service;


import co.danieldev.oneforall.javacore.Tgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

    public Boat retrieveAvailableBoat() {
        System.out.println("Searching for any boat available...");
        Boat boat = boatsAvailable.remove(0);
        System.out.println("Renting the boat: "+ boat);
        System.out.println("Available boats to rent: " + boatsAvailable);
        return boat;
    }

    public void returnRentBoat(Boat boat) {
        System.out.println("Returning the boat: "+ boat);
        boatsAvailable.add(boat);
        System.out.println("Available boats to rent: "+ boatsAvailable);
    }
}
