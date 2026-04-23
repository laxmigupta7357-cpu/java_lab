import mypack.Add1;
import mypack.subpack.Square2;

public class TestPackage2 {
    public static void main(String[] args) {

        Add1 a = new Add1();
        Square2 s = new Square2();

        System.out.println("Addition: " + a.add(10,5));
        System.out.println("Square: " + s.square(5));
    }
}