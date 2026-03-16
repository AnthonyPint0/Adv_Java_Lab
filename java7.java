class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class running...");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running...");
    }
}

public class java7 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        System.out.println("t1 state after creation: " + t1.getState());
        t1.start();
        t2.start();
        System.out.println("t1 state after start: " + t1.getState());

        t1.join();
        t2.join();
        System.out.println("t1 state after completion: " + t1.getState());
    }
}
