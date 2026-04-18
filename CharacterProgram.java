import java.io.*;

public class CharacterProgram {
    public static void main(String[] args) {
        try {
            
            FileWriter fw = new FileWriter("charfile.txt");
            fw.write("Hello Java");
            fw.close();

            
            FileReader fr = new FileReader("charfile.txt");
            int ch;

            System.out.println("File Content:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}