import java.io.*;

public class FileCopyCharacter {
    public static void main(String[] args) {
        try {
            
            FileWriter fw1 = new FileWriter("source.txt");
            fw1.write("Hello Java Character Copy");
            fw1.close();

            
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("Character File Copied Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}