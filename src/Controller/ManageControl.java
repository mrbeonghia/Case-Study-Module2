package Controller;

import Model.Book;
import Model.Borrower;

import java.util.ArrayList;

public class ManageControl {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Borrower> borrowers = new ArrayList<>();
//    static ArrayList<Manage> manages = new ArrayList<>();
//
//    public ManageControl(ArrayList<Manage> manages) {
//        this.manages = manages;
//    }
//
//    public ManageControl() {
//    }
//
//    public static ArrayList<Manage> getManages() {
//        return manages;
//    }
//
//    public void setManages(ArrayList<Manage> manages) {
//        this.manages = manages;
//    }
//
//
//        public void showListManage(ArrayList<Manage> manages) {
//        System.out.println("____________Thông tin quản lý mượn sách____________");
//        System.out.printf("%-10s%-20s%-15s%-20s%-15s%-10s%-15s\n", "ReaderID",
//                "Reader Name", "BookID", "Book Name", "Quantity", "State", "Total");
//        for (Manage m :ManageControl.getManages()) {
//            System.out.printf("%-10d%-20s%-15d%-20s%-15d%-10s%-15d\n",
//                    m.getBorrower().getBorrowerId(),
//                    m.getBorrower().getBorrowerName(),
//                    m.getBook().getBookId(),
//                    m.getBook().getBookName(),
//                    m.getNumOfBorrow(),
//                    m.getState(),
//                    m.getTotal()
//            );
//        }
//    }
//    public void setManageInfo() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("_________Nhập thông tin sách_________");
//        String state;
//        int numOfBorrow,total;
//        Manage manage = new Manage();
//        manage.getBorrower().getBorrowerId();
//        manage.getBook().setBookId();
//        System.out.println("Nhập số lượng sách mượn: ");
//        numOfBorrow = Integer.parseInt(scanner.nextLine());
//        manage.setNumOfBorrow(numOfBorrow);
//        System.out.println("Nhập tình trạng sách: ");
//        state = scanner.nextLine();
//        manage.setState(state);
//        System.out.println("Nhập tổng sách: ");
//        total = Integer.parseInt(scanner.nextLine());
//        manage.setTotal(total);
//        manages.add(manage);
//        writeManageToFile("Manage.csv", manage);
//    }

//    public void getManageInfo() {
//        manages = readManageFromFile();
//        for (Manage list : manages) {
//            System.out.println(list);
//        }
//    }

}

