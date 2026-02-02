// Using Thread class
class AddThread extends Thread {
    public void run() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
    }
}

class SubThread extends Thread {
    public void run() {
        int a = 10, b = 5;
        System.out.println("Subtraction: " + (a - b));
    }
}

// Using Runnable interface
class Multiply implements Runnable {
    public void run() {
        int a = 10, b = 5;
        System.out.println("Multiplication: " + (a * b));
    }
}

class Divide implements Runnable {
    public void run() {
        int a = 10, b = 5;
        System.out.println("Division: " + (a / b));
    }
}

public class CombinedArithmeticThreads {
    public static void main(String[] args) {

        // Thread class objects
        AddThread t1 = new AddThread();
        SubThread t2 = new SubThread();

        // Runnable interface objects
        Thread t3 = new Thread(new Multiply());
        Thread t4 = new Thread(new Divide());

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
