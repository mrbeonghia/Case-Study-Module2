package Model;

import Controller.IOFile;

import java.io.Serializable;
import java.util.List;

public class Borrower implements Serializable {
    private int borrowerId;
    private String borrowerName;
    private String borrowerAddress;
    private String borrowerPhone;
    public static int idCounter = 0;

    public Borrower(int borrowerId, String borrowerName, String borrowerAddress, String borrowerPhone) {
        this.borrowerId = borrowerId;
        this.borrowerName = borrowerName;
        this.borrowerAddress = borrowerAddress;
        this.borrowerPhone = borrowerPhone;
    }

    public Borrower() {

    }


    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId() {
        List<Borrower> borrowerList = IOFile.readBorrowerFromFile();
        if (borrowerList.isEmpty()) {
            idCounter = 0;
        } else {
            idCounter = borrowerList.get(borrowerList.size() - 1).getBorrowerId();
        }
        this.borrowerId = ++idCounter;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerAddress() {
        return borrowerAddress;
    }

    public void setBorrowerAddress(String borrowerAddress) {
        this.borrowerAddress = borrowerAddress;
    }

    public String getBorrowerPhone() {
        return borrowerPhone;
    }

    public void setBorrowerPhone(String borrowerPhone) {
        this.borrowerPhone = borrowerPhone;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "borrowerId=" + borrowerId +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowerAddress='" + borrowerAddress + '\'' +
                ", borrowerPhone='" + borrowerPhone + '\'' +
                '}';
    }

}

