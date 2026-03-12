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
