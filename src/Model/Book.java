package Model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;

public class Book implements Serializable {
    public static int id = 1000;
    private int bookID;
    private String bookName;
    private String author;
    private String category;
    private String publisher;
    private int publishYear;
    private int quantity;

    public Book(int bookID) {
        this.bookID = bookID;
    }

    public Book() {
    }

    public Book(String bookName, String author,
                String category, String publisher, int publishYear, int quantity) {
        setBookID();// id tu tang
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID() {
        this.bookID = id++;
    }

    public void setBookID(int id){
        bookID = id;
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
        return getClass().getName() + "[bookID= " + bookID + ", bookName= " + bookName
                + ", category= " + category + ", author= " + author
                + ", publishYear= " + publishYear + ", quantity= " + quantity + "]";
    }
}
