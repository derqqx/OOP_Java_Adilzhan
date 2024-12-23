import java.util.ArrayList;
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

}
