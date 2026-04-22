class WithoutThread {
    void print(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

// Thread using extends Thread
class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

// Thread using Runnable
class MyRunnable implements Runnable {
    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        System.out.println("----- WITHOUT THREAD -----");
        WithoutThread obj = new WithoutThread();
        obj.print("A");
        obj.print("B");
        obj.print("C");

        System.out.println("\n----- WITH THREAD -----");
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        MyThread t3 = new MyThread("C");

        t1.start();
        t2.start();
        t3.start();

        try { Thread.sleep(1000); } catch(Exception e){}

        System.out.println("\n----- USING RUNNABLE -----");
        Thread r1 = new Thread(new MyRunnable("A"));
        Thread r2 = new Thread(new MyRunnable("B"));
        Thread r3 = new Thread(new MyRunnable("C"));

        r1.start();
        r2.start();
        r3.start();
    }
}