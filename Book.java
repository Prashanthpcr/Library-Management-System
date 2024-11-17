class Book {
    private final String title;
    private final String author;
    private boolean isBorrowed;
    private String borrower;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.borrower = null;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getBorrower() {
        return borrower;
    }

    public void borrowBook(String borrower) {
        this.isBorrowed = true;
        this.borrower = borrower;
    }

    public void returnBook() {
        this.isBorrowed = false;
        this.borrower = null;
    }

    @Override
    public String toString() {
        return String.format("Title: %s | Author: %s | Borrowed: %s", title, author, isBorrowed ? "Yes, by " + borrower : "No");
    }
}
