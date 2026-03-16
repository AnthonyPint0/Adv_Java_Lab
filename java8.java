class NumberTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class MessageTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message from thread 2");
        }
    }
}

public class java8 {
    public static void main(String[] args) throws InterruptedException {
        NumberTask t1 = new NumberTask();
        MessageTask t2 = new MessageTask();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Both threads finished.");
    }
}
