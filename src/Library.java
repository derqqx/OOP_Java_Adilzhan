import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private String libraryName;
    private List<Book> books = new ArrayList<>();
    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Removed book: " + book);
    }

    public void sortBooksByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }
}
