package co.danieldev.oneforall.javacore.ZZAconcurrent.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public double getPricesSync(String storeName) {
        System.out.printf("Getting prices sync for store %s %n", storeName);
        return priceGenerator();
    }

    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    };

    private  void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
