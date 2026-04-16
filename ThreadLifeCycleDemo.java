// Creating a thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class is running");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread class count: " + i);
            try {
                Thread.sleep(500); // Thread goes to waiting state for 5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Creating a thread using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface is running");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        // NEW State
        MyThread t1 = new MyThread();
        System.out.println("State of t1 after creation: " + t1.getState());
        // Runnable implementation
        Thread t2 = new Thread(new MyRunnable());
        // RUNNABLE State
        t1.start();
        t2.start();
        System.out.println("State of t1 after start(): " + t1.getState());
        try {
            t1.join(); // this is used to wait for t1 to finish before proceeding
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        // TERMINATED State
        System.out.println("State of t1 after completion: " + t1.getState());
    }
}
