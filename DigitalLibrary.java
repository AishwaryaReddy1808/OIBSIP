import java.util.ArrayList;
import java.util.Scanner;

public class DigitalLibrary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            System.out.println("Welcome to the Digital Library!");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(library, scanner);
                    break;
                case 2:
                    removeBook(library, scanner);
                    break;
                case 3:
                    searchBook(library, scanner);
                    break;
                case 4:
                    displayBooks(library);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 5);
    }

    public static void addBook(ArrayList<Book> library, Scanner scanner) {
        System.out.println("Enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.println("Enter the year of book was published: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the ISBN of the book: ");
        String isbn = scanner.nextLine();
        Book book = new Book(title, author, year, isbn);
        library.add(book);
        System.out.println("Book added successfully!");
    }

    public static void removeBook(ArrayList<Book> library, Scanner scanner) {
        System.out.println("Enter the ISBN of the book you want to remove: ");
        String isbn = scanner.nextLine();
        boolean removed = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getIsbn().equals(isbn)) {
                library.remove(i);
                removed = true;
                System.out.println("Book removed successfully!");
                break;
            }
        }
        if (!removed) {
            System.out.println("Book not found.");
        }
    }

    public static void searchBook(ArrayList<Book> library, Scanner scanner) {
        System.out.println("Enter the title of the book you want to search for: ");
        String title = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getTitle().equals(title)) {
                System.out.println(library.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void displayBooks(ArrayList<Book> library) {
        System.out.println("All books in the library: ");
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i));
        }
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor
