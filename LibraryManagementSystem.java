import java.util.*;

public class LibraryManagementSystem {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");

        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\n==== Library Menu ====");
        System.out.println("1. Add a Book");
        System.out.println("2. Remove a Book");
        System.out.println("3. Check Book Availability");
        System.out.println("4. Borrow a Book");
        System.out.println("5. Return a Book");
        System.out.println("6. View All Books");
        System.out.println("7. Exit");
        System.out.println("=======================");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return -1;
        }
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                removeBook();
                break;
            case 3:
                checkBookAvailability();
                break;
            case 4:
                borrowBook();
                break;
            case 5:
                returnBook();
                break;
            case 6:
                library.viewAllBooks();
                break;
            case 7:
                System.out.println("Exiting the system. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        library.addBook(new Book(title, author));
    }

    private static void removeBook() {
        System.out.print("Enter Book Title to Remove: ");
        String title = scanner.nextLine();
        library.removeBook(title);
    }

    private static void checkBookAvailability() {
        System.out.print("Enter Book Title to Check: ");
        String title = scanner.nextLine();
        library.checkBookAvailability(title);
    }

    private static void borrowBook() {
        System.out.print("Enter Book Title to Borrow: ");
        String title = scanner.nextLine();
        System.out.print("Enter Your Name: ");
        String borrower = scanner.nextLine();
        library.borrowBook(title, borrower);
    }

    private static void returnBook() {
        System.out.print("Enter Book Title to Return: ");
        String title = scanner.nextLine();
        library.returnBook(title);
    }
}
