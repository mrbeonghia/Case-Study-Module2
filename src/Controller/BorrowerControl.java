package Controller;

import Model.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Controller.IOFile.*;

public class BorrowerControl {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Model.Borrower> listBorrowers = new ArrayList<>();

    public static ArrayList<Model.Borrower> getListBorrowers() {
        return listBorrowers;
    }

    public static void setListBorrowers(ArrayList<Model.Borrower> listBorrowers) {
        BorrowerControl.listBorrowers = listBorrowers;
    }

    public void setBorrowerInfo(){
        System.out.println("_________Nhập thông tin người mượn sách_________");
        String name, address, phone;
        Borrower borrower = new Borrower();
        borrower.setBorrowerId();
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
        listBorrowers = readBorrowerFromFile();
        for(Borrower list :listBorrowers){
            System.out.println(list);
        }
    }

//    public void updateBookInfo(){
//        writeBookUpdate("Book.csv",listBorrowers);
//    }
    public void findBorrowerByName() {
        System.out.println("Nhập tên người mượn muốn tìm: ");
        String regex = scanner.nextLine();
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < BorrowerControl.getListBorrowers().size(); i++) {
            matcher = pattern.matcher(BorrowerControl.getListBorrowers().get(i).getBorrowerName());
            if (matcher.find()) {
                System.out.println(BorrowerControl.getListBorrowers().get(i).getBorrowerId()+ " " +
                        BorrowerControl.getListBorrowers().get(i).getBorrowerName() + " " +
                        BorrowerControl.getListBorrowers().get(i).getBorrowerAddress()+ " " +
                        BorrowerControl.getListBorrowers().get(i).getBorrowerPhone());
                count++;
            }
        }
        if (count <= 0) {
            System.out.println("Không tìm thấy!");
        }
    }

    public void sortBorrowerByName(){
        listBorrowers = readBorrowerFromFile();
        Collections.sort(listBorrowers, new Comparator<Borrower>() {
            @Override
            public int compare(Borrower borrower1, Borrower borrower2) {
                return (borrower1.getBorrowerName().compareTo(borrower2.getBorrowerName()));
            }
        });
        for (Borrower list :listBorrowers) {
            System.out.println(list);
        }
    }
}
