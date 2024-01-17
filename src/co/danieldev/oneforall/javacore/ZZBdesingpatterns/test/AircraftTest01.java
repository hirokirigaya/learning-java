package co.danieldev.oneforall.javacore.ZZBdesingpatterns.test;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("737");
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));
    }
}
