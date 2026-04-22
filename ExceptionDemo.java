public class ExceptionDemo {
    public static void main(String[] args) {

        // 🔹 Array Exception
        try {
            int arr[] = new int[5];

            for(int i = 0; i <= 5; i++) {   // ❌ error (index 5 invalid)
                arr[i] = i;
            }

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Index out of bounds!");
        }

        // 🔹 Arithmetic Exception
        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // ❌ divide by zero

        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Error: Cannot divide by zero!");
        }
    }
}