[program-1 WAP for HelloWorld](#code1)
[program-2 WAP for library management](#code2)
[program-3 WAP for printing right triangle pattern](#code3)
[program-4 WAP for check the number is armstrong or not](#code4)
[program-5 WAP for check the number is palindrome or not](#code5)
[program-6 WAP to print fibonacci series](#code6)
[program-7 WAP to print factorial of a number](#code7)
[program-8 WAP to perform Matrix operations on 3*3 matrix](#code8)
[program-9 WAP for addition of two times where each time each give in hr,min, sec ](#code9)
[program-10 WAP for addition of two times where each time each give in hr,min](#code10)
[program-11 WAP  for the addition of two distances where each distance is given in meter ,cm and mm ](#code11)
[program-12 WAP  for the addition of two distances where each distance is given in meter ,cm ](#code12)
[program-13 WAP for the addition ,subtraction ,multiplication ,division ](#code13)
[program-14 WAP using objects and classes to do the reverse of 1D array](#code14)
[program-15 WAP to demonstrate single Inheritance](#code15)
[program-16 WAP to demonstrate multilevel Inheritance](#code16)
[program-17 WAP to demonstrate hierarchical Inheritance](#code17)
[program-18 WAP to write data into a file using FileWriter and read the same file using FileReader](#code18)
[program-19 WAP to write data into a file using FileOutputStream and read the same file using FileInputStream](#code19)
[program-20 WAP to copy the contents of one file (source.txt) to another file (dest.txt) using character stream classes (FileReader and FileWriter)](#code-20).
[program-21 WAP to copy data from one file to another using byte stream classes (FileInputStream and FileOutputStream)](#code-21). 
[program-22 WAP to copy the contents of one file to another file using character stream (FileReader and FileWriter)](#code-22). 
[program-23 WAP to copy the contents of one file to another file using byte stream (FileInputStream and FileOutputStream).](#code-23).
[program-24 WAP using three classes to print 1-100 ,1-100,1-100 with and without thread and analyse the output and repeat the same program using runnable interface.](#code-24).
[program-25 WAP Using the concept of multithreading the output of all three threads must be synchronised (use join method).](#code-25)
[program-26 WAP for Addition of 2 numbers using swing..](#code-26).
[program-27 Make a registration form with 10 elements and send the data into database (use jdbc connectivity).](#code-27).
[program-28 Make one calculator in swing.](#code-28).
[program-29 Matrix Addition using swing class.](#code-29).
[program-30  Create one jframe apply 10 buttons on that after clicking on each button a new structure is created.(Circle, oval rectangle, etc ....) .](#code-30).
[program-31 Just using mouse Event create a frame like paint brush with selection of colour and width .](#code-31).
[program-32 Create a package of any 5 classes of your choice and import it.](#code-32).
[program-33 Create one package and sub package  import and test it .](#code-33).
[program-34 Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception .](#code-34).
[program-35 To test the range of age of one student.write a program using user defined exception.](#code-35).
[program-36 Inheritance Programs, using interface and abstract classes..](#code-36).



## code-1
```
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
<img width="83" height="11" alt="image" src="https://github.com/user-attachments/assets/e3744f25-d79a-4320-87dc-bfbb168aef25" />

## code-2
```
class Book {

    String title;
    String author;
    String isbn;

    static int totalBooks = 0;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;  
    }


    void borrowBook() {
        System.out.println(title + " has been borrowed.");
    }

    void returnBook() {
        System.out.println(title + " has been returned.");
    }

    static int getTotalBooks() {
        return totalBooks;
    }
}

public class LibraryTest {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James", "101");
        Book b2 = new Book("OOP Concepts", "Robert", "102");

        b1.borrowBook();
        b2.returnBook();

        System.out.println("Total Books: " + Book.getTotalBooks());
    }
}
```
<img width="170" height="38" alt="image" src="https://github.com/user-attachments/assets/a1c19397-55a7-4f00-b8e4-24b854cf9e85" />

## code-3
```
class Pattern2
{
    void printPattern()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Pattern2 p = new Pattern2();
        p.printPattern();
    }
}
```
<img width="56" height="62" alt="image" src="https://github.com/user-attachments/assets/4a8a0a9f-5ac9-47c2-8e73-5368d5caeeed" />

## code-4
```
class Armstrong
{
    int num = 153;

    void check()
    {
        int temp = num;
        int sum = 0, rem;

        while(num > 0)
        {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if(temp == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }

    public static void main(String[] args)
    {
        Armstrong a = new Armstrong();
        a.check();
    }
}
```
<img width="114" height="16" alt="image" src="https://github.com/user-attachments/assets/aac26a24-368e-4f15-aec5-ff51f9ae7bf8" />

## code-5
```
class Palindrome
{
    int num = 121;

    void check()
    {
        int temp = num;
        int rev = 0, rem;

        while(num > 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(temp == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

    public static void main(String[] args)
    {
        Palindrome p = new Palindrome();
        p.check();
    }
}
```

<img width="116" height="13" alt="image" src="https://github.com/user-attachments/assets/0f9b9bef-a587-4bb6-b62e-9979252a91ba" />

## code-6
```
class Fibonacci
{
    int n = 10;

    void printSeries()
    {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for(int i = 2; i < n; i++)
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();
        f.printSeries();
    }
}
```
<img width="233" height="12" alt="image" src="https://github.com/user-attachments/assets/e5deaffc-617a-45d0-853b-21d31543d100" />

## code-7
```
class Factorial
{
    int num = 5;
    int fact = 1;

    void calculate()
    {
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }

    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        f.calculate();
    }
}
```

<img width="122" height="11" alt="image" src="https://github.com/user-attachments/assets/414faab4-07b7-49a2-b3ea-23ca29c0df9c" />

## code-8
```
class MatrixOperations
{
    int a[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int b[][] = {
        {1,1,1},
        {1,1,1},
        {1,1,1}
    };

    void transpose()
    {
        System.out.println("Transpose of Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }

    void sumMatrix()
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of matrix elements = "+sum);
    }

    void multiply()
    {
        int c[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    void rowSum()
    {
        System.out.println("Sum of rows:");
        for(int i=0;i<3;i++)
        {
            int sum=0;
            for(int j=0;j<3;j++)
            {
                sum=sum+a[i][j];
            }
            System.out.println("Row "+(i+1)+" = "+sum);
        }
    }

    void columnSum()
    {
        System.out.println("Sum of columns:");
        for(int j=0;j<3;j++)
        {
            int sum=0;
            for(int i=0;i<3;i++)
            {
                sum=sum+a[i][j];
            }
            System.out.println("Column "+(j+1)+" = "+sum);
        }
    }

    void diagonalSum()
    {
        int main=0, secondary=0;

        for(int i=0;i<3;i++)
        {
            main+=a[i][i];
            secondary+=a[i][2-i];
        }

        System.out.println("Main Diagonal Sum = "+main);
        System.out.println("Secondary Diagonal Sum = "+secondary);
    }

    public static void main(String args[])
    {
        MatrixOperations m=new MatrixOperations();

        m.transpose();
        m.sumMatrix();
        m.multiply();
        m.rowSum();
        m.columnSum();
        m.diagonalSum();
    }
}
```
<img width="173" height="247" alt="image" src="https://github.com/user-attachments/assets/80e3b5fa-a730-40ab-9c4d-ba8ae36b819d" />

## code-9
```
class Times
{
    int hr;
    int min;
    int sec;

    void add()
    {
        int h1 = 2, m1 = 45, s1 = 50;
        int h2 = 3, m2 = 20, s2 = 50;

        hr = h1 + h2;
        min = m1 + m2;
        sec = s1 + s2;

        // convert seconds to minutes
        min = min + (sec / 60);
        sec = sec % 60;

        // convert minutes to hours
        hr = hr + (min / 60);
        min = min % 60;

        System.out.println("Total Time = " + hr + " hr " + min + " min " + sec + " sec");
    }

    public static void main(String[] args)
    {
        Times t = new Times();
        t.add();
    }
}
```
<img width="167" height="17" alt="image" src="https://github.com/user-attachments/assets/b328d9e6-e6fb-4d4f-893d-10311181a5f6" />

## code-10
```
class Time
{
    int hr;
    int min;

    void add()
    {
        int h1 = 3, m1 = 45;
        int h2 = 2, m2 = 30;

        hr = h1 + h2;
        min = m1 + m2;

        // convert minutes to hours
        hr = hr + (min / 60);
        min = min % 60;

        System.out.println("Total Time = " + hr + " hr " + min + " min");
    }

    public static void main(String[] args)
    {
        Time t = new Time();
        t.add();
    }
}
```
<img width="139" height="19" alt="image" src="https://github.com/user-attachments/assets/973d6ae3-2d8d-40c3-b270-d7623e3d1243" />

## code-11
```
class Distance
{
    int meter;
    int cm;
    int mm;

    void add()
    {
        int m1 = 2, c1 = 50, mm1 = 30;
        int m2 = 3, c2 = 70, mm2 = 80;

        meter = m1 + m2;
        cm = c1 + c2;
        mm = mm1 + mm2;

        // convert mm to cm
        cm = cm + (mm / 10);
        mm = mm % 10;

        // convert cm to meter
        meter = meter + (cm / 100);
        cm = cm % 100;

        System.out.println("Total Distance = " + meter + " m " + cm + " cm " + mm + " mm");
    }

    public static void main(String[] args)
    {
        Distance d = new Distance();
        d.add();
    }
}
```
<img width="181" height="18" alt="image" src="https://github.com/user-attachments/assets/95ebdf80-658b-4176-8cec-90af230ad7e8" />

## code-12
```
class Distances
{
    int meter;
    int cm;

    void add()
    {
        int m1 = 4, c1 = 80;
        int m2 = 3, c2 = 50;

        meter = m1 + m2;
        cm = c1 + c2;

        // convert cm to meter
        meter = meter + (cm / 100);
        cm = cm % 100;

        System.out.println("Total Distance = " + meter + " meter " + cm + " cm");
    }

    public static void main(String[] args)
    {
        Distances d = new Distances();
        d.add();
    }
}
```
<img width="172" height="17" alt="image" src="https://github.com/user-attachments/assets/989c24cc-312f-49ba-8be3-66cafb869d4d" />

## code-13
```
class Calculator
{
    int a = 10;
    int b = 5;

    void addition()
    {
        System.out.println("Addition = " + (a + b));
    }

    void subtraction()
    {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiplication()
    {
        System.out.println("Multiplication = " + (a * b));
    }

    void division()
    {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        c.addition();
        c.subtraction();
        c.multiplication();
        c.division();
    }
}
```
<img width="146" height="53" alt="image" src="https://github.com/user-attachments/assets/04bda29b-714a-4238-88ae-1a87bbff38e9" />

## code-14
```
class ReverseArray
{
    void reverse()
    {
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nReversed Array:");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        ReverseArray r = new ReverseArray();
        r.reverse();
    }
}
```
<img width="98" height="52" alt="image" src="https://github.com/user-attachments/assets/a89c15af-1055-4688-a0b2-198157b0d577" />

## code-15
```
class A
{
    void show()
    {
        System.out.println("This is Parent class");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("This is Child class");
    }
}

class SingleInheritance
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
```
<img width="125" height="27" alt="image" src="https://github.com/user-attachments/assets/3eca8dcc-6f55-496b-bf16-1ba3f37ef0be" />

## code-16
```
class A
{
    void show()
    {
        System.out.println("Class A");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("Class B");
    }
}

class C extends B
{
    void print()
    {
        System.out.println("Class C");
    }
}

class MultilevelInheritance
{
    public static void main(String args[])
    {
        C obj = new C();
        obj.show();
        obj.display();
        obj.print();
    }
}
```
<img width="67" height="44" alt="image" src="https://github.com/user-attachments/assets/faa0b166-19b6-40d9-842e-637f2d1ecabe" />

## code-17
```
class A
{
    void show()
    {
        System.out.println("Parent class");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("Child class B");
    }
}

class C extends A
{
    void print()
    {
        System.out.println("Child class C");
    }
}

class HierarchicalInheritance
{
    public static void main(String args[])
    {
        B obj1 = new B();
        C obj2 = new C();

        obj1.show();
        obj1.display();

        obj2.show();
        obj2.print();
    }
}
```
<img width="87" height="56" alt="image" src="https://github.com/user-attachments/assets/51620887-1d27-4ec8-b381-3f12bdbd9877" />

## code-18
```
import java.io.*;

public class CharacterProgram {
    public static void main(String[] args) {
        try {
            // Writing into file
            FileWriter fw = new FileWriter("charfile.txt");
            fw.write("Hello Java");
            fw.close();

            // Reading from file
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
```
<img width="679" height="79" alt="image" src="https://github.com/user-attachments/assets/d8c8f963-81bd-449a-95c4-2cfd8fdba49c" />

## code-19
```
import java.io.*;

public class ByteProgram {
    public static void main(String[] args) {
        try {
            // Writing into file
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            String data = "Hello";
            fos.write(data.getBytes());
            fos.close();

            // Reading from file
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
```
<img width="699" height="68" alt="image" src="https://github.com/user-attachments/assets/37e1684b-8606-4993-b627-c589f6b5da69" />

## code-20
```
import java.io.*;

public class FileCopyCharacter {
    public static void main(String[] args) {
        try {
            // Create source file (optional for testing)
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
```
<img width="690" height="49" alt="image" src="https://github.com/user-attachments/assets/d1aa29c6-9120-4fcf-81be-e3c29446e27f" />


## code-21
```
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
```
<img width="682" height="53" alt="image" src="https://github.com/user-attachments/assets/11a2cce4-82ba-41b9-9fea-233cf75ea9f7" />


## code-22
```
import java.io.*;

public class CharFileCopy {
    public static void main(String[] args) {
        try {
            FileWriter test = new FileWriter("source.txt");
            test.write("Hello Java Character Copy");
            test.close();

            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest_char.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using character stream");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="684" height="47" alt="image" src="https://github.com/user-attachments/assets/ebd5c9ab-e805-48b5-b2c1-dad32e8fb461" />

## code-23
```
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
```
<img width="677" height="48" alt="image" src="https://github.com/user-attachments/assets/a6f1ac7e-727b-4c0c-89c7-1c843325721f" />


## code-24
```
class WithoutThread {
    void print(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

// Thread using extends Thread
class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

// Thread using Runnable
class MyRunnable implements Runnable {
    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        System.out.println("----- WITHOUT THREAD -----");
        WithoutThread obj = new WithoutThread();
        obj.print("A");
        obj.print("B");
        obj.print("C");

        System.out.println("\n----- WITH THREAD -----");
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        MyThread t3 = new MyThread("C");

        t1.start();
        t2.start();
        t3.start();

        try { Thread.sleep(1000); } catch(Exception e){}

        System.out.println("\n----- USING RUNNABLE -----");
        Thread r1 = new Thread(new MyRunnable("A"));
        Thread r2 = new Thread(new MyRunnable("B"));
        Thread r3 = new Thread(new MyRunnable("C"));

        r1.start();
        r2.start();
        r3.start();
    }
}
```
<img width="671" height="112" alt="image" src="https://github.com/user-attachments/assets/8d9fed39-3d30-4e6c-a998-b387c4540c72" />
<img width="142" height="110" alt="image" src="https://github.com/user-attachments/assets/3e5bda2f-2cfa-4bdb-bc80-8cf4c482b333" />
<img width="173" height="110" alt="image" src="https://github.com/user-attachments/assets/efb87359-64a8-46e4-bd30-1dee291cc034" />

## code-25
```
class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        MyThread t3 = new MyThread("C");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
```
<img width="685" height="136" alt="image" src="https://github.com/user-attachments/assets/c1bc9918-8afa-4d66-a60f-625c98b7ea1c" />

## code-26
```
import javax.swing.*;

public class AddGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b = new JButton("Add");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        t3.setBounds(50,150,100,30);
        b.setBounds(50,200,100,30);

        f.add(t1); f.add(t2); f.add(t3); f.add(b);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int c = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a+c));
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="209" height="218" alt="image" src="https://github.com/user-attachments/assets/9f7e85f1-f9af-4487-890c-e1c11dac9438" />

## code-27
```
import javax.swing.*;
import java.awt.event.*;

public class RegisterForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");

        // Labels
        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Email:");
        JLabel l3 = new JLabel("Password:");
        JLabel l4 = new JLabel("Gender:");
        JLabel l5 = new JLabel("DOB:");
        JLabel l6 = new JLabel("Phone:");
        JLabel l7 = new JLabel("Address:");
        JLabel l8 = new JLabel("Course:");
        JLabel l9 = new JLabel("Hobbies:");
        JLabel l10 = new JLabel("Country:");

        // TextFields
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JPasswordField t3 = new JPasswordField();
        JTextField t5 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();

        // Radio Buttons (Gender)
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);

        // ComboBox (Course)
        String courses[] = {"B.Tech","BCA","MCA","MBA"};
        JComboBox c1 = new JComboBox(courses);

        // CheckBoxes (Hobbies)
        JCheckBox h1 = new JCheckBox("Reading");
        JCheckBox h2 = new JCheckBox("Music");
        JCheckBox h3 = new JCheckBox("Sports");

        // Country ComboBox
        String country[] = {"India","USA","UK","Canada"};
        JComboBox c2 = new JComboBox(country);

        // Button
        JButton b = new JButton("Submit");

        // Set Bounds
        l1.setBounds(50,30,100,30);   t1.setBounds(150,30,150,30);
        l2.setBounds(50,70,100,30);   t2.setBounds(150,70,150,30);
        l3.setBounds(50,110,100,30);  t3.setBounds(150,110,150,30);
        l4.setBounds(50,150,100,30);  r1.setBounds(150,150,70,30); r2.setBounds(220,150,80,30);
        l5.setBounds(50,190,100,30);  t5.setBounds(150,190,150,30);
        l6.setBounds(50,230,100,30);  t6.setBounds(150,230,150,30);
        l7.setBounds(50,270,100,30);  t7.setBounds(150,270,150,30);
        l8.setBounds(50,310,100,30);  c1.setBounds(150,310,150,30);
        l9.setBounds(50,350,100,30);  h1.setBounds(150,350,80,30); h2.setBounds(230,350,80,30); h3.setBounds(310,350,80,30);
        l10.setBounds(50,390,100,30); c2.setBounds(150,390,150,30);

        b.setBounds(150,440,100,30);

        // Add components
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(r1); f.add(r2);
        f.add(l5); f.add(t5);
        f.add(l6); f.add(t6);
        f.add(l7); f.add(t7);
        f.add(l8); f.add(c1);
        f.add(l9); f.add(h1); f.add(h2); f.add(h3);
        f.add(l10); f.add(c2);
        f.add(b);

        // Button Action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Registration Successful");
            }
        });

        f.setSize(450,550);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="326" height="401" alt="image" src="https://github.com/user-attachments/assets/f5135b5b-de5b-4c07-97c5-d4486cd9f2da" />
<img width="197" height="92" alt="image" src="https://github.com/user-attachments/assets/fb10be2a-7d20-4590-9b2c-3c489395b2c2" />

## code-28
```
import javax.swing.*;

public class CalculatorSwing {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JTextField t = new JTextField();
        t.setBounds(30,30,240,30);

        // Buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("+");

        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");

        JButton b9 = new JButton("7");
        JButton b10 = new JButton("8");
        JButton b11 = new JButton("9");
        JButton b12 = new JButton("*");

        JButton b13 = new JButton("0");
        JButton b14 = new JButton("C");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton("/");

        // Set positions
        b1.setBounds(30,80,50,40);
        b2.setBounds(90,80,50,40);
        b3.setBounds(150,80,50,40);
        b4.setBounds(210,80,50,40);

        b5.setBounds(30,130,50,40);
        b6.setBounds(90,130,50,40);
        b7.setBounds(150,130,50,40);
        b8.setBounds(210,130,50,40);

        b9.setBounds(30,180,50,40);
        b10.setBounds(90,180,50,40);
        b11.setBounds(150,180,50,40);
        b12.setBounds(210,180,50,40);

        b13.setBounds(30,230,50,40);
        b14.setBounds(90,230,50,40);
        b15.setBounds(150,230,50,40);
        b16.setBounds(210,230,50,40);

        // Add components
        f.add(t);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);
        f.add(b5); f.add(b6); f.add(b7); f.add(b8);
        f.add(b9); f.add(b10); f.add(b11); f.add(b12);
        f.add(b13); f.add(b14); f.add(b15); f.add(b16);

        // Variables
        final int[] num1 = new int[1];
        final int[] num2 = new int[1];
        final char[] op = new char[1];

        // Number buttons
        b1.addActionListener(e -> t.setText(t.getText() + "1"));
        b2.addActionListener(e -> t.setText(t.getText() + "2"));
        b3.addActionListener(e -> t.setText(t.getText() + "3"));
        b5.addActionListener(e -> t.setText(t.getText() + "4"));
        b6.addActionListener(e -> t.setText(t.getText() + "5"));
        b7.addActionListener(e -> t.setText(t.getText() + "6"));
        b9.addActionListener(e -> t.setText(t.getText() + "7"));
        b10.addActionListener(e -> t.setText(t.getText() + "8"));
        b11.addActionListener(e -> t.setText(t.getText() + "9"));
        b13.addActionListener(e -> t.setText(t.getText() + "0"));

        // Operators
        b4.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '+'; t.setText(""); });
        b8.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '-'; t.setText(""); });
        b12.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '*'; t.setText(""); });
        b16.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '/'; t.setText(""); });

        // Equal
        b15.addActionListener(e -> {
            num2[0] = Integer.parseInt(t.getText());
            int result = 0;

            switch(op[0]) {
                case '+': result = num1[0] + num2[0]; break;
                case '-': result = num1[0] - num2[0]; break;
                case '*': result = num1[0] * num2[0]; break;
                case '/': result = num1[0] / num2[0]; break;
            }

            t.setText(String.valueOf(result));
        });

        // Clear
        b14.addActionListener(e -> t.setText(""));

        // Frame settings
        f.setSize(320,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="224" height="250" alt="image" src="https://github.com/user-attachments/assets/a43f2772-1719-4ab9-88df-665f25b65e1f" />

## code-29
```
import javax.swing.*;
import java.awt.event.*;

public class MatrixAdditionSwing {

    public static void main(String[] args) {

        JFrame f = new JFrame("Matrix Addition");

        // Matrix A fields
        JTextField a11 = new JTextField();
        JTextField a12 = new JTextField();
        JTextField a21 = new JTextField();
        JTextField a22 = new JTextField();

        // Matrix B fields
        JTextField b11 = new JTextField();
        JTextField b12 = new JTextField();
        JTextField b21 = new JTextField();
        JTextField b22 = new JTextField();

        // Result fields
        JTextField r11 = new JTextField();
        JTextField r12 = new JTextField();
        JTextField r21 = new JTextField();
        JTextField r22 = new JTextField();

        JButton addBtn = new JButton("Add");

        // Set bounds (Matrix A)
        a11.setBounds(50,50,40,30);
        a12.setBounds(100,50,40,30);
        a21.setBounds(50,90,40,30);
        a22.setBounds(100,90,40,30);

        // Matrix B
        b11.setBounds(200,50,40,30);
        b12.setBounds(250,50,40,30);
        b21.setBounds(200,90,40,30);
        b22.setBounds(250,90,40,30);

        // Result Matrix
        r11.setBounds(350,50,40,30);
        r12.setBounds(400,50,40,30);
        r21.setBounds(350,90,40,30);
        r22.setBounds(400,90,40,30);

        // Button
        addBtn.setBounds(200,150,80,30);

        // Add components
        f.add(a11); f.add(a12); f.add(a21); f.add(a22);
        f.add(b11); f.add(b12); f.add(b21); f.add(b22);
        f.add(r11); f.add(r12); f.add(r21); f.add(r22);
        f.add(addBtn);

        // Button action
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int A11 = Integer.parseInt(a11.getText());
                int A12 = Integer.parseInt(a12.getText());
                int A21 = Integer.parseInt(a21.getText());
                int A22 = Integer.parseInt(a22.getText());

                int B11 = Integer.parseInt(b11.getText());
                int B12 = Integer.parseInt(b12.getText());
                int B21 = Integer.parseInt(b21.getText());
                int B22 = Integer.parseInt(b22.getText());

                r11.setText(""+(A11+B11));
                r12.setText(""+(A12+B12));
                r21.setText(""+(A21+B21));
                r22.setText(""+(A22+B22));
            }
        });

        f.setSize(500,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="358" height="210" alt="image" src="https://github.com/user-attachments/assets/dee42dbf-28e6-4e76-9f3f-885fadc33e2b" />

## code-30
```
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ShapeFrame extends JFrame implements ActionListener {

    String shape = "";

    public ShapeFrame() {
        setTitle("Shape Drawer");

        // Buttons
        String names[] = {"Circle","Oval","Rectangle","Square","Line",
                          "Arc","RoundRect","3DRect","FillOval","FillRect"};

        for(int i=0;i<10;i++) {
            JButton b = new JButton(names[i]);
            b.setBounds(20 + (i%5)*100, 20 + (i/5)*50, 90, 30);
            b.addActionListener(this);
            add(b);
        }

        setSize(550,400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint(); // redraw
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw shapes
        if(shape.equals("Circle"))
            g.drawOval(200,150,100,100);

        else if(shape.equals("Oval"))
            g.drawOval(200,150,150,100);

        else if(shape.equals("Rectangle"))
            g.drawRect(200,150,150,100);

        else if(shape.equals("Square"))
            g.drawRect(200,150,100,100);

        else if(shape.equals("Line"))
            g.drawLine(200,150,350,250);

        else if(shape.equals("Arc"))
            g.drawArc(200,150,150,100,0,180);

        else if(shape.equals("RoundRect"))
            g.drawRoundRect(200,150,150,100,30,30);

        else if(shape.equals("3DRect"))
            g.draw3DRect(200,150,150,100,true);

        else if(shape.equals("FillOval"))
            g.fillOval(200,150,150,100);

        else if(shape.equals("FillRect"))
            g.fillRect(200,150,150,100);
    }

    public static void main(String[] args) {
        new ShapeFrame();
    }
}
```
<img width="396" height="280" alt="image" src="https://github.com/user-attachments/assets/20719def-227f-48b8-ba51-056dff588f8d" />

## code-31
```
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintBrush extends JFrame {

    int x1, y1, x2, y2;
    Color color = Color.BLACK;
    int width = 2;

    public PaintBrush() {
        setTitle("Paint Brush");

        // Buttons for colors
        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");

        // ComboBox for width
        Integer sizes[] = {2,4,6,8,10};
        JComboBox cb = new JComboBox(sizes);

        red.setBounds(20,40,70,30);
        blue.setBounds(100,40,70,30);
        green.setBounds(180,40,80,30);
        cb.setBounds(280,40,70,30);

        add(red); add(blue); add(green); add(cb);

        // Color actions
        red.addActionListener(e -> color = Color.RED);
        blue.addActionListener(e -> color = Color.BLUE);
        green.addActionListener(e -> color = Color.GREEN);

        // Width selection
        cb.addActionListener(e -> width = (int)cb.getSelectedItem());

        // Mouse events
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();

                Graphics g = getGraphics();
                g.setColor(color);
                ((Graphics2D)g).setStroke(new BasicStroke(width));

                g.drawLine(x1, y1, x2, y2);

                x1 = x2;
                y1 = y2;
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });

        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintBrush();
    }
}
```
<img width="356" height="279" alt="image" src="https://github.com/user-attachments/assets/5e71f920-9dde-476c-87dc-0ae3a1184a43" />

## code-32
```
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
```
<img width="108" height="66" alt="image" src="https://github.com/user-attachments/assets/b8dadf9e-b96d-40b6-a6a5-9939532b60f9" />


## code-33
```
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
```
<img width="81" height="25" alt="image" src="https://github.com/user-attachments/assets/5e2f63d9-d44a-450f-a1f4-e89bcddd0329" />

## code-34
```
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
```
<img width="686" height="85" alt="image" src="https://github.com/user-attachments/assets/e2755b17-7688-4fa3-839e-fbf2d0b42540" />

## code-35
```
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
```
<img width="683" height="56" alt="image" src="https://github.com/user-attachments/assets/f5c791d5-4eec-4a5d-a05b-69095ef2318c" />

## code-36
```
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
```
<img width="687" height="95" alt="image" src="https://github.com/user-attachments/assets/efa0ae4a-1bfd-4852-b0eb-9402e76c8fa2" />



