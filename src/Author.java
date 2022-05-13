public class Author {
    private final String name;
    private final String surname;

    public Author(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
