package Controller;

import Model.*;


import java.util.ArrayList;
import java.util.Scanner;

import static Controller.DAO.*;

public class BorrowerControl {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Borrower> listBorrowers = new ArrayList<>();

    public static ArrayList<Borrower> getListBorrowers() {
        return listBorrowers;
    }

    public static void setListBorrowers(ArrayList<Borrower> listBorrowers) {
        BorrowerControl.listBorrowers = listBorrowers;
    }

    public void setBorrowerInfo(){
        System.out.println("_________Nhập thông tin người mượn sách_________");
        String name, address, phone;
        Borrower borrower = new Borrower();
        System.out.println("Nhập họ và tên: ");
        name = scanner.nextLine();
        borrower.setBorrowerName(name);
        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
        borrower.setBorrowerAddress(address);
        System.out.println("Nhập số điện thoại: ");
        phone = scanner.nextLine();
        borrower.setBorrowerPhone(phone);
        listBorrowers.add(borrower);
        writeBorrowerToFile("Borrower.csv",borrower);
    }

    public void getBorrowerInfo(){
        readBorrowerFromFile("Borrower.csv");
    }


}
