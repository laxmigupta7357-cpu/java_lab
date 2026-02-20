```
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
<img width="83" height="11" alt="image" src="https://github.com/user-attachments/assets/e3744f25-d79a-4320-87dc-bfbb168aef25" />


```
class Book {

    // Instance variables
    String title;
    String author;
    String isbn;

    // Static variable
    static int totalBooks = 0;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;   // Increase count when book object is created
    }

    // Instance method
    void borrowBook() {
        System.out.println(title + " has been borrowed.");
    }

    // Instance method
    void returnBook() {
        System.out.println(title + " has been returned.");
    }

    // Static method
    static int getTotalBooks() {
        return totalBooks;
    }
}

// Test Class
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


