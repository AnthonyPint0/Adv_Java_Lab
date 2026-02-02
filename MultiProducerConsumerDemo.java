import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    // Producer method
    public synchronized void produce(int value) {
        while (buffer.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        buffer.add(value);
        System.out.println(Thread.currentThread().getName() + " produced: " + value);

        notifyAll(); // wake up all waiting threads
    }

    // Consumer method
    public synchronized void consume() {
        while (buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        int value = buffer.remove();
        System.out.println(Thread.currentThread().getName() + " consumed: " + value);

        notifyAll(); // wake up all waiting threads
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    Producer(Buffer buffer, String name) {
        super(name);
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    Consumer(Buffer buffer, String name) {
        super(name);
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

public class MultiProducerConsumerDemo {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer p1 = new Producer(buffer, "Producer-1");
        Producer p2 = new Producer(buffer, "Producer-2");

        Consumer c1 = new Consumer(buffer, "Consumer-1");
        Consumer c2 = new Consumer(buffer, "Consumer-2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
