package A30_Encapsulation.Task1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {
//    to check if book has 3 prices, (Leather Bound, Hardcover, Audiobook)//
//    create class Book
//    name, author, publishedDate, leatherBoundPrice, hardCoverPrice, audioBookPrice
//    encapsulate Book
//    check book has three prices in a method

    private String bookName;
    private String author;
    private LocalDate publishedDate;
    private float leatherBoundPrice;
    private float hardCoverPrice;
    private float audioBookPrice;

    public Book() {
    }
    public Book(String bookName) {
        setBookName(bookName);
    }
    public Book(String bookName, String author) {
        this(bookName);
//        setBookName(bookName);
        setAuthor(author);
    }
    public Book(String bookName, String author, String publishedDate) {
        this(bookName, author);
//        setBookName(bookName);
//        setAuthor(author);
        setPublishedDate(publishedDate);
    }
    public Book(String bookName, String author, String publishedDate, float leatherBoundPrice) {
        setBookName(bookName);
        setAuthor(author);
        setPublishedDate(publishedDate);
        setLeatherBoundPrice(leatherBoundPrice);
    }
    public Book(String bookName, String author, String publishedDate, float leatherBoundPrice, float hardCoverPrice) {
        setBookName(bookName);
        setAuthor(author);
        setPublishedDate(publishedDate);
        setLeatherBoundPrice(leatherBoundPrice);
        setHardCoverPrice(hardCoverPrice);
    }
    public Book(String bookName, String author, String publishedDate, float leatherBoundPrice, float hardCoverPrice,
                float audioBookPrice) {
        this(bookName, author, publishedDate, leatherBoundPrice, hardCoverPrice);
//        setBookName(bookName);
//        setAuthor(author);
//        setPublishedDate(publishedDate);
//        setLeatherBoundPrice(leatherBoundPrice);
//        setHardCoverPrice(hardCoverPrice);
        setAudioBookPrice(audioBookPrice);
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return this.publishedDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
    public void setPublishedDate(String publishedDate) {

        this.publishedDate = LocalDate.parse(publishedDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    }

    public float getLeatherBoundPrice() {
        return leatherBoundPrice;
    }
    public void setLeatherBoundPrice(float leatherBoundPrice) {
        this.leatherBoundPrice = leatherBoundPrice;
    }

    public float getHardCoverPrice() {
        return hardCoverPrice;
    }
    public void setHardCoverPrice(float hardCoverPrice) {
        this.hardCoverPrice = hardCoverPrice;
    }

    public float getAudioBookPrice() {
        return audioBookPrice;
    }
    public void setAudioBookPrice(float audioBookPrice) {
        this.audioBookPrice = audioBookPrice;
    }

    public boolean hasThreePrices(){
        return getAudioBookPrice() != 0 && getHardCoverPrice() != 0 && getLeatherBoundPrice() != 0;
    }
}
