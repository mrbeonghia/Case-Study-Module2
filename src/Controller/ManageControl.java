package Controller;

import Model.Book;
import Model.Borrower;
import Model.Manage;

import java.util.ArrayList;

public class ManageControl {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Borrower> borrowers = new ArrayList<>();
    static ArrayList<Manage> manages = new ArrayList<>();

    public ManageControl(ArrayList<Manage> manages) {
        this.manages = manages;
    }

    public static ArrayList<Manage> getManages() {
        return manages;
    }

    public void setManages(ArrayList<Manage> manages) {
        this.manages = manages;
    }

    public void showListManage(ArrayList<Manage> manages) {
        System.out.println("____________Thông tin quản lý mượn sách____________");
        System.out.printf("%-10s%-20s%-15s%-20s%-15s%-10s%-15s\n", "ReaderID",
                "Reader Name", "BookID", "Book Name", "Quantity", "State", "Total");
        for (Manage m :ManageControl.getManages()) {
            System.out.printf("%-10d%-20s%-15d%-20s%-15d%-10s%-15d\n",
                    m.getBorrower().getBorrowerId(),
                    m.getBorrower().getBorrowerName(),
                    m.getBook().getBookID(),
                    m.getBook().getBookName(),
                    m.getNumOfBorrow(),
                    m.getState(),
                    m.getTotal()
            );
        }
    }
}

