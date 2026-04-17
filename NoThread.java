class A {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("A: " + i);
    }
}

class B {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("B: " + i);
    }
}

class C {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("C: " + i);
    }
}

public class NoThread {
    public static void main(String[] args) {
        new A().print();
        new B().print();
        new C().print();
    }
}