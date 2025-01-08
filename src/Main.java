import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Library library = new Library("Cherie");

        Book book1 = new Book("Jo Nesbo", "Rodstrupe", 2000);
        Book book2 = new Book("Jo Nesbo", "Marekors", 2003);
        Book book3 = new Book("Jo Nesbo", "Snomannen", 2007);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println("Comparing books:");
        if (book1.equals(book2)) {
            System.out.println("Book 1 and Book 2 are the same.");
        } else {
            System.out.println("Book 1 and Book 2 are different.");
        }

        if (book1.equals(book3)) {
            System.out.println("Book 1 and Book 3 are the same.");
        } else {
            System.out.println("Book 1 and Book 3 are different.");
        }

        if (book2.equals(book3)) {
            System.out.println("Book 2 and Book 3 are the same.");
        } else {
            System.out.println("Book 2 and Book 3 are different.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author to search: ");
        String author = scanner.nextLine();
        System.out.println("Books by " + author + ":");

        // Печать всех книг этого автора
        for (Book book : library.searchByAuthor(author)) {
            System.out.println(book);
        }

        System.out.print("Enter title to remove: ");
        String titleToRemove = scanner.nextLine();

        // Печать всех книг для проверки
        System.out.println("Books available for removal: ");
        for (Book book : library.searchByAuthor(author)) {
            System.out.println(book);
        }

        Book bookToRemove = null;
        for (Book book : library.searchByAuthor(author)) {
            if (book.getTitle().equalsIgnoreCase(titleToRemove)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            library.removeBook(bookToRemove);
        } else {
            System.out.println("Book not found!");
        }

        LibraryMember member = new LibraryMember(1001 , "Dancing Queen");
        System.out.println("Library member: " + member);
    }
}
