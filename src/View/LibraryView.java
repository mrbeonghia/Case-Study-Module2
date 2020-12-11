package View;

import Controller.*;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryView {
    int choice = 0;

    public static void main(String[] args) {
        BookControl bookControl = new BookControl();
        BorrowerControl borrowerControl = new BorrowerControl();
        ManageControl manageControl = new ManageControl();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n________XIN MỜI CHỌN MỘT CHỨC NĂNG________");
            System.out.println("1. Thêm 1 người mượn sách mới.");
            System.out.println("2. Hiển thị danh sách những người mượn sách.");
            System.out.println("3. Thêm 1 đầu sách mới.");
            System.out.println("4. Hiển thị danh sách các đầu sách.");
            System.out.println("5. Hiển thị thông tin mượn sách.");
            System.out.println("6. Sắp xếp thông tin mượn sách.");
            System.out.println("7. Tìm kiếm thông tin người mượn sách theo tên.");
            System.out.println("0. Thoát chương trình.");
            System.out.println("Bạn chọn ? ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.err.println(e);
                System.err.println("Nhập sai định dạng, vui lòng nhập lại");
            }

            switch (choice) {
                case 0:
                    System.out.println("____________Thoát khỏi chương trình____________");
                    System.out.println("Cảm ơn quý vị đã sử dụng dịch vụ của chúng tôi!");
                    break;

                case 1:
                    try {
                        borrowerControl.setBorrowerInfo();
                        break;
                    } catch (Exception e) {
                        System.err.println(e);
                        System.err.println("Nhập sai định dạng, vui lòng nhập lại");
                    }
                case 2:
                    borrowerControl.getBorrowerInfo();
                    break;

                case 3:
                while (true){
                    try {
                        bookControl.setBookInfo();
                        break;
                    } catch (Exception e) {
                        System.err.println(e);
                        System.err.println("Nhập sai định dạng, vui lòng nhập lại");
                    }
                }
                case 4:
                    bookControl.getBookInfo();
                    break;

                case 5:

//                    manageControl.setManageInfo();
//                    managerments = IOFile.readManageFromFile();
//                    int sortChoice = 0;
//                    do {
//                        System.out.println("___________Lựa chọn sắp xếp___________");
//                        System.out.println("1. Sắp xếp theo tên bạn đọc.");
//                        System.out.println("2. Sắp xếp theo tổng số lượng mượn.");
//                        System.out.println("0. Thoát khỏi chức năng này.");
//                        System.out.println("Bạn chọn ? ");
//                        sortChoice = scanner.nextInt();
//                        switch (sortChoice) {
//                            case 0:
//                                break;
//                            case 1:
//                                managerments = bookControl.sortBookByName();
//                                showBRMInfo(managerments);
//                                break;
//                            case 2:
//                                managerments = sortByNumOfBorrowed(managerments);
//                                showBRMInfo(managerments);
//                                break;
//                        }
//                    } while (sortChoice != 0);

                    break;

                case 6:
//                    bookControl.sortBookByName();
//                    manageControl.getManageInfo();
                    break;
                case 7:
                    System.out.println("Nhập Id sách");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println(bookControl.findBookById(id));
                default:
                    System.out.println("Not found!");
            }
        } while (true);


    }
}