package co.danieldev.oneforall.javacore.Tgenerics.test;


import co.danieldev.oneforall.javacore.Tgenerics.domain.Boat;
import co.danieldev.oneforall.javacore.Tgenerics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();

        Boat boat = boatRentalService.retrieveAvailableBoat();
        System.out.println("Using the boat an entire month ");
        boatRentalService.returnRentBoat(boat);
    }
}
