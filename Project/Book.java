import java.util.*;

public class Book {
    private int bookid;
    private String bookName;
    private double bookPrice;
    private String authorName;
    private static String libraryName = "ABC Library";
    private boolean availability;

    // Constructor
    public Book(int bookid, String bookName, double bookPrice, String authorName) {
        this.bookid = bookid;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true;
    }

    // Method to create book
    public static Book createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookid = scanner.nextInt();

        System.out.print("Enter Book Name: ");
        String bookName = scanner.next();

        System.out.print("Enter Book Price: ");
        double bookPrice = scanner.nextDouble();

        System.out.print("Enter Author Name: ");
        String authorName = scanner.next();

        return new Book(bookid, bookName, bookPrice, authorName);
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Author Name: " + authorName);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    // Method to display book details by name
    public boolean displayBookByName(String name) {
        if (bookName.equals(name)) {
            displayBook();
        }
        return availability;
    }

    // Method to borrow book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book " + bookName + " borrowed successfully!");
        } else {
            System.out.println("Sorry, Book " + bookName + " is not available!");
        }
    }

    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book(1, "The Great ready", 1223, "F.ratt");
        Book book2 = new Book(2, "To Kill", 8999, "Lee");
        Book book3 = new Book(3, "1984", 1099, "George");
        Book book4 = new Book(4, "The Catcher", 9999, "Sachin");
        Book book5 = new Book(5, "Pride", 7999, "Jane");

        // Display book details
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book4.displayBook();
        book5.displayBook();
        System.out.println("------------------------------------------------------");

        // Borrow a book
        book5.borrowBook();

        System.out.println("----------------------------------------------------------");

        // Display book details by name
        System.out.print(book2.displayBookByName("pride"));
    }
}