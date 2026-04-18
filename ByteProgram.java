import java.io.*;

public class ByteProgram {
    public static void main(String[] args) {
        try {
            
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            String data = "Hello";
            fos.write(data.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("bytefile.txt");
            int b;

            System.out.println("File Content:");
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }

            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}