public class LibraryMember {

    private int id;
    private String name;

    public LibraryMember(int id, String name) {
        setId(id);
        setName(name);
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
    //тут ничего не изменилось
    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'';
    }
}