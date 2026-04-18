import java.io.*;

public class ByteFileCopy {
    public static void main(String[] args) {
        try {
            
            FileOutputStream test = new FileOutputStream("source.txt");
            String data = "Hello Java Byte Copy";
            test.write(data.getBytes());
            test.close();

            
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest_byte.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("File copied using byte stream");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}