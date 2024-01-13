import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Patron");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Books");
            System.out.println("6. Search Patrons");
            System.out.println("7. Generate Reports");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    addPatron(scanner, library);
                    break;
                case 3:
                    borrowBook(scanner, library);
                    break;
                case 4:
                    returnBook(scanner, library);
                    break;
                case 5:
                    searchBooks(scanner, library);
                    break;
                case 6:
                    searchPatrons(scanner, library);
                    break;
                case 7:
                    generateReports(library);
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book genre: ");
        String genre = scanner.nextLine();

        Book book = new Book(title, author, genre);
        library.addBook(book);

        System.out.println("Book added successfully.");
    }

    private static void addPatron(Scanner scanner, Library library) {
        System.out.print("Enter patron name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patron contact information: ");
        String contactInfo = scanner.nextLine();

        Patron patron = new Patron(name, contactInfo);
        library.addPatron(patron);

        System.out.println("Patron added successfully.");
    }

    private static void borrowBook(Scanner scanner, Library library) {
        // Implement borrowing logic
    }

    private static void returnBook(Scanner scanner, Library library) {
        // Implement returning logic
    }

    private static void searchBooks(Scanner scanner, Library library) {
        // Implement book search logic
    }

    private static void searchPatrons(Scanner scanner, Library library) {
        // Implement patron search logic
    }

    private static void generateReports(Library library) {
        // Implement report generation logic
    }
}

class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    // Getters and setters
}

class Patron {
    private String name;
    private String contactInfo;
    private List<Book> borrowingHistory;

    public Patron(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowingHistory = new ArrayList<>();
    }

    // Getters and setters
}

class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Implement additional methods for borrowing, returning, searching, and reporting
}
