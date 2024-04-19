// PrintedBook.java
public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Page count: " + pageCount;
    }
}
