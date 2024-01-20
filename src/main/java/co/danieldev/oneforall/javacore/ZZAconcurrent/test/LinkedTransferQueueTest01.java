package co.danieldev.oneforall.javacore.ZZAconcurrent.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();

        System.out.println(tq.add("Dan"));
        System.out.println(tq.offer("dani_fery"));
        System.out.println(tq.offer("Ferri", 20, TimeUnit.SECONDS));
        tq.put("Daniel");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Asuna");
        }
        System.out.println(tq.tryTransfer("Kirito"));
        System.out.println(tq.tryTransfer("Kirisuna", 10, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
