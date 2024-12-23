public class Main {
    public static void main(String[] args) {

        Library library = new Library("Cherie");

        library.addBook(new Book("Jo Nesbo", "Rødstrupe", 2000));
        library.addBook(new Book("Jo Nesbo", "Marekors", 2003));

        library.displayBooks();

        LibraryMember member = new LibraryMember(1001 , "Dancing Queen", library);
        System.out.println("Library member: " + member);

    }
}