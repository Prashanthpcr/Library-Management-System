import java.util.*;

class Library {
    private final Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        if (books.containsKey(book.getTitle())) {
            System.out.println("Book already exists in the library.");
        } else {
            books.put(book.getTitle(), book);
            System.out.println("Book added successfully!");
        }
    }

    public void removeBook(String title) {
        if (books.remove(title) != null) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public void checkBookAvailability(String title) {
        if (books.containsKey(title)) {
            System.out.println("The book \"" + title + "\" is available.");
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
        }
    }

    public void borrowBook(String title, String borrower) {
        Book book = books.get(title);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isBorrowed()) {
            System.out.println("Book is currently borrowed by " + book.getBorrower() + ".");
        } else {
            book.borrowBook(borrower);
            System.out.println("Book borrowed successfully by " + borrower + ".");
        }
    }

    public void returnBook(String title) {
        Book book = books.get(title);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isBorrowed()) {
            System.out.println("This book was not borrowed.");
        } else {
            book.returnBook();
            System.out.println("Book returned successfully!");
        }
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("\n=== Books in the Library ===");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }
}
