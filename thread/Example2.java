package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            System.out.println("1 Before - Count: " + counter.count);
            for (int i = 0; i < 100000; i++) {
                counter.incrementCount();
            }
            System.out.println("1 After - Count: " + counter.count);
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("2 Before - Count: " + counter.count);
            for (int i = 0; i < 100000; i++) {
                counter.incrementCount();
            }
            System.out.println("2 After - Count: " + counter.count);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.count);
    }
}

class Counter {

    public int count = 0;
    public Lock lock = new ReentrantLock();

    public void incrementCount() {
        count = count + 1;
    }

    /*
     * synchronized method
     */
    // public synchronized void incrementCount() {
    // count = count + 1;
    // }

    /*
     * synchronized block
     */
    // public void incrementCount() {
    // synchronized (this) {
    // count = count + 1;
    // }
    // }

    /*
     * synchronized with lock
     */
    // public void incrementCount() {
    // lock.lock();
    // try {
    // count = count + 1;
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // } finally {
    // lock.unlock();
    // }
    // }
}
