package co.danieldev.oneforall.javacore.Hinterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void loading() {
        System.out.println("Loading...");
    }

    @Override
    public void remove() {
        System.out.println("Removing...");
    }
}
