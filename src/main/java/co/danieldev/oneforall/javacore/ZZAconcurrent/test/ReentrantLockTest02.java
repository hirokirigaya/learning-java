package co.danieldev.oneforall.javacore.ZZAconcurrent.test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Worker2 implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker2(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            boolean b = lock.tryLock(2, TimeUnit.SECONDS);
            if (lock.isHeldByCurrentThread()) {
                System.out.printf("%s acquired the lock%n", name);
            }
            System.out.printf("Object %s entered in critical session%n", name);
            System.out.printf("%d Threads waiting for the lock%n", lock.getQueueLength());
            System.out.printf("Object %s is going to wait 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("%s finished the session%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }


}

public class ReentrantLockTest02 {
    public static void main(String[] args) {
        final ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker2("A", lock)).start();
        new Thread(new Worker2("B", lock)).start();
        new Thread(new Worker2("C", lock)).start();
        new Thread(new Worker2("D", lock)).start();
        new Thread(new Worker2("F", lock)).start();
        new Thread(new Worker2("G", lock)).start();
    }
}
