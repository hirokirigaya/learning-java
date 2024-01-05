package co.danieldev.oneforall.javacore.Zthreads.domain;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (this.emails) {
            while(this.emails.size() == 0) {
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " No emails found to be send, waiting for instructions...");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " just added an email to the list");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notifying all threads that emails are closed");
            this.emails.notifyAll();
        }
    }
}
