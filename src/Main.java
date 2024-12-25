public class Main {
    public static void main(String[] args) {

        Library library = new Library("Cherie");

        Book book1 = new Book("Jo Nesbo", "Rødstrupe", 2000);
        Book book2 = new Book("Jo Nesbo", "Marekors", 2003);
        Book book3 = new Book("Jo Nesbo", "Snømannen", 2007);

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

        LibraryMember member = new LibraryMember(1001 , "Dancing Queen");
        System.out.println("Library member: " + member);
    }
}