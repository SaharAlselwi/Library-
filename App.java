// App.java
public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        PrintedBook book2 = new PrintedBook("1984", "George Orwell", 1949, 328);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
    }
}

// by Sahar Alselwi
