import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if(age < 18)
                throw new InvalidAgeException("Not eligible!");
            else
                System.out.println("Eligible");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}