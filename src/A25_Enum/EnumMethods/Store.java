package A25_Enum.EnumMethods;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        Store store = new Store();
        store.printFantasyBooks();

    }

    public void printFantasyBooks(){

        ArrayList<Book> books = getBooks();

        for (Book book:books) {
            if(book.getBookCategory() == BookCategory.FANTASY){
                System.out.println(book);
            }
        }

    }

    public ArrayList<Book> getBooks(){

        ArrayList<Book> bookList = new ArrayList<>();

        Book book1 = new Book("Merhaba Dunya", BookCategory.FANTASY);

        Book book2 = new Book("Para Akimi", BookCategory.ECONOMY);

        bookList.add(book1);
        bookList.add(book2);

        return bookList;

    }

}
