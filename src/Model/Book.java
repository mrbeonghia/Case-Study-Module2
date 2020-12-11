package Model;

import Controller.IOFile;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    public static int idCounter = 0;
    private int bookId;
    private String bookName;
    private String author;
    private String category;
    private String publisher;
    private int publishYear;
    private int quantity;

    public Book(int bookId, String bookName, String author, String category, String publisher, int publishYear, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }
    public Book(int i){}

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookId(){
        List<Book> bookList = IOFile.readBookFromFile();
        if (bookList.isEmpty()) {
            idCounter = 0;
        } else {
            idCounter = bookList.get(bookList.size() - 1).getBookId();
        }
        this.bookId = ++idCounter;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishYear=" + publishYear +
                ", quantity=" + quantity +
                '}';
    }
}
