import mypack.*;

public class TestPackage {
    public static void main(String[] args) {

        Add1 a = new Add1();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        Square sq = new Square();

        System.out.println("Addition: " + a.add(10,5));
        System.out.println("Subtraction: " + s.sub(10,5));
        System.out.println("Multiplication: " + m.mul(10,5));
        System.out.println("Division: " + d.div(10,5));
        System.out.println("Square: " + sq.square(5));
    }
}