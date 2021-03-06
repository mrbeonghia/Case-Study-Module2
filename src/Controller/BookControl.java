package Controller;

import Model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Controller.IOFile.*;

public class BookControl {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Book> listBooks = new ArrayList<>();

    public static ArrayList<Book> getListBooks() {
        return listBooks;
    }

    public static void setListBooks(ArrayList<Book> listBooks) {
        BookControl.listBooks = listBooks;
    }

    public void setBookInfo() {
        System.out.println("____________Nhập thông tin Sách____________");
        String bookName, author, category, publisher;
        int quantity, publishYear;
        Book book = new Book();
        book.setBookId();
        System.out.println("Nhập tên sách: ");
        bookName = scanner.nextLine();
        book.setBookName(bookName);
        System.out.println("Nhập tác giả: ");
        author = scanner.nextLine();
        book.setAuthor(author);
        System.out.println("Nhập thể loại: ");
        category = scanner.nextLine();
        book.setCategory(category);
        System.out.println("Nhập nhà xuất bản: ");
        publisher = scanner.nextLine();
        book.setPublisher(publisher);
        System.out.println("Nhập năm xuất bản: ");
        publishYear = Integer.parseInt(scanner.nextLine());
        book.setPublishYear(publishYear);
        System.out.println("Nhập số lượng: ");
        quantity = Integer.parseInt(scanner.nextLine());
        book.setQuantity(quantity);
        listBooks.add(book);
        writeBookToFile("Book.csv", book);
    }

    public void getBookInfo() {
        listBooks = readBookFromFile();
        for (Book list :listBooks) {
            System.out.println(list);
        }
    }

//    public void updateBookInfo(){
//        writeBookUpdate("Book.csv",listBooks);
//    }
    public void findBookByName() {
        System.out.println("Nhập tên sách bạn muốn tìm: ");
        String regex = scanner.nextLine();
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < BookControl.getListBooks().size(); i++) {
            matcher = pattern.matcher(BookControl.getListBooks().get(i).getBookName());
            if (matcher.find()) {
                System.out.println(BookControl.getListBooks().get(i).getBookName() + " " +
                        BookControl.getListBooks().get(i).getAuthor() + " " +
                        BookControl.getListBooks().get(i).getCategory() + " " +
                        BookControl.getListBooks().get(i).getPublisher() + " " +
                        BookControl.getListBooks().get(i).getPublishYear() + " " +
                        BookControl.getListBooks().get(i).getQuantity());
                count++;
            }
        }
        if (count <= 0) {
            System.out.println("Không tìm thấy!");
        }
    }

    public Book findBookById(int id) {
        for (Book b:listBooks) {
            if (b.getBookId() == id) {
                return b;
            }
        }
        return null;
    }

    public void sortBookByName(){
        listBooks = readBookFromFile();
        Collections.sort(listBooks, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return (book1.getBookName().compareTo(book2.getBookName()));
            }
        });
        for (Book list :listBooks) {
            System.out.println(list);
        }
    }

    public void removeBook(int idRemove){
        try {
            Book book = null;
            for (Book b : listBooks){
                if (b.getBookId() == idRemove){
                    book = b;
                    break;
                }
            }
            listBooks.indexOf(book);
            listBooks.remove(listBooks.indexOf(book));
            if (book == null){
                System.out.println("Mã sản phẩm không tồn tại, mời nhập lại: ");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        IOFile.updateBookToFile("Book.csv",  listBooks);
    }

    public void updateListProduct() {
        IOFile.updateBookToFile("Book.csv", BookControl.getListBooks());
    }

}
