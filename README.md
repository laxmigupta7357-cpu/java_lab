[program-1 WAP for HelloWorld](#code1)
[program-2 WAP for library management](#code2)
[program-3 WAP for printing right triangle pattern](#code3)
[program-4 WAP for check the number is armstrong or not](#code4)
[program-5 WAP for check the number is palindrome or not](#code5)
[program-6 WAP to print fibonacci series](#code6)
[program-7 WAP to print factorial of a number](#code7)
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

