// Library.java
public class Library {
    private Book[] books;
    private int numBooks;
    private static final int MAX_BOOKS = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < MAX_BOOKS) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
