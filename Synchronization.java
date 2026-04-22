class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        MyThread t3 = new MyThread("C");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}