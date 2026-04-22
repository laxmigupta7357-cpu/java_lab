class MyRunnable implements Runnable {
    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=1;i<=100;i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("A"));
        Thread t2 = new Thread(new MyRunnable("B"));
        Thread t3 = new Thread(new MyRunnable("C"));

        t1.start();
        t2.start();
        t3.start();
    }
}