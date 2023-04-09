package A25_Enum.EnumMethods;

public class Book {

    private String name;
    private BookCategory bookCategory;

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "\nBook" +
                "\nname :" + name +
                "\nbookCategory :" + bookCategory;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public String getName() {
        return name;
    }
}
