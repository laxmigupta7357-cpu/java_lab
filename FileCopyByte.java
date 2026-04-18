import java.io.*;

public class FileCopyByte {
    public static void main(String[] args) {
        try {
            
            FileOutputStream fos1 = new FileOutputStream("source.txt");
            String data = "Hello Java Byte Copy";
            fos1.write(data.getBytes());
            fos1.close();

           
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("Byte File Copied Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}