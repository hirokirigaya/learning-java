package co.danieldev.oneforall.javacore.Zthreads.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirstName() {
        if (names.size() > 0) {
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Kirito");
        Runnable r = threadSafeNames::removeFirstName;
        new Thread(r).start();
        new Thread(r).start();
    }
}
