public class LibraryMember {

    private int id;
    private String name;
    private Library library;

    public LibraryMember(int id, String name, Library library) {
        setId(id);
        setName(name);
        setLibrary(library);
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    @Override
    public String toString() {
        return "LibraryMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", library=" + library +
                '}';
    }
}
