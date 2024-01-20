package co.danieldev.oneforall.javacore.Scollection.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        for (String letter : queue) {
            System.out.println(letter);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
