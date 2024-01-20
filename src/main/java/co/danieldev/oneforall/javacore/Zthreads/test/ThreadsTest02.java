package co.danieldev.oneforall.javacore.Zthreads.test;


class ThreadExampleRunnable2 implements Runnable {
    private final char c;

    public ThreadExampleRunnable2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
//            Thread.yield();
        }
    }
}

public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new ThreadExampleRunnable2('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable2('B'));
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        System.out.println("##################### "+ Thread.currentThread().getName() + " #####################");
    }
}
