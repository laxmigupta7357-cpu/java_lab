// Interface
interface Shape {
    void area();
}

// Abstract Class
abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Fuel is required");
    }
}

// Parent Class (Inheritance)
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child Class (Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Class implementing Interface
class Circle implements Shape {
    public void area() {
        int r = 5;
        System.out.println("Circle Area = " + (3.14 * r * r));
    }
}

// Class extending Abstract Class
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

// Main Class
public class AllInOneDemo {
    public static void main(String[] args) {

        // 🔹 Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // 🔹 Interface
        Shape s = new Circle();
        s.area();

        // 🔹 Abstract Class
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}