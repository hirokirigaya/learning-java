package co.danieldev.oneforall.javacore.ZZAconcurrent.test;

import co.danieldev.oneforall.javacore.ZZAconcurrent.service.StoreService;
import co.danieldev.oneforall.javacore.ZZAconcurrent.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesCompletableFutureAsync(storeServiceDeprecated);
    }


    private static void searchPricesCompletableFutureAsync(StoreServiceDeprecated service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPricesSync(s), executorService))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);
        executorService.shutdown();
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

}
