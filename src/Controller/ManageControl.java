package Controller;

import Model.Book;
import Model.Borrower;

import java.util.ArrayList;

public class ManageControl {
    public void showListManage(){
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Borrower> borrowers = new ArrayList<>();
        books = BookControl.getListBooks();
        borrowers = BorrowerControl.getListBorrowers();
        
    }
}
