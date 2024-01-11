package co.danieldev.oneforall.javacore.ZZAconcurrent.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int number;

    public Printer(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.printf("%s start: %d%n", Thread.currentThread().getName(), number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finished%n", Thread.currentThread().getName());
    }
}

public class ExecutorTest01 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        System.out.println(threadPoolExecutor.getActiveCount());
        executorService.shutdown();

        System.out.println("Executor service is off");
    }
}
