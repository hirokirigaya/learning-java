package co.danieldev.oneforall.javacore.ZZAconcurrent.test;

import co.danieldev.oneforall.javacore.ZZAconcurrent.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesFutureAsync(storeService);
        searchPricesCompletableFutureAsync(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPricesSync("Store 1"));
        System.out.println(storeService.getPricesSync("Store 2"));
        System.out.println(storeService.getPricesSync("Store 3"));
        System.out.println(storeService.getPricesSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesFutureAsync(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsync1 = storeService.getPricesFutureAsync("Store 1");
        Future<Double> pricesAsync2 = storeService.getPricesFutureAsync("Store 2");
        Future<Double> pricesAsync3 = storeService.getPricesFutureAsync("Store 3");
        Future<Double> pricesAsync4 = storeService.getPricesFutureAsync("Store 4");
        try {
            System.out.println((pricesAsync1.get()));
            System.out.println((pricesAsync2.get()));
            System.out.println((pricesAsync3.get()));
            System.out.println((pricesAsync4.get()));
        } catch (InterruptedException | ExecutionException e) {

            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesCompletableFutureAsync(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsync1 = storeService.getPricesCompletableFutureAsync("Store 1");
        CompletableFuture<Double> pricesAsync2 = storeService.getPricesCompletableFutureAsync("Store 2");
        CompletableFuture<Double> pricesAsync3 = storeService.getPricesCompletableFutureAsync("Store 3");
        CompletableFuture<Double> pricesAsync4 = storeService.getPricesCompletableFutureAsync("Store 4");
        try {
            System.out.println((pricesAsync1.get()));
            System.out.println((pricesAsync2.get()));
            System.out.println((pricesAsync3.get()));
            System.out.println((pricesAsync4.get()));
        } catch (InterruptedException | ExecutionException e) {

            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

}
