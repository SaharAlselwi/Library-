// App.java
public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Great Expectations", "Charles Dickens", 1861);
        PrintedBook book2 = new PrintedBook("The Time Machine", "H.G. Wells", 1895, 118);
        Book book3 = new Book("Tom Sawyer", "Mark Twain", 1876);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
    }
}

// Sahar Alselwi
