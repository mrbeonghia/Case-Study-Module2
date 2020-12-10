package View;

import Controller.*;

import java.io.IOException;

public class LibraryView {
    int choice = 0;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    BookControl bookControl = new BookControl();
    bookControl.setBookInfo();
    bookControl.updateBookInfo();
    bookControl.findBookByName();

//    bookController.setBookInfo();
//        DAO.readBookFromFile("Book.csv");
//        BorrowerControl borrowerController = new BorrowerControl();
//        borrowerController.setBorrowerInfo();
//        borrowerController.getBorrowerInfo();


//    }
//        int choice = 0;
//        Scanner scanner = new Scanner(System.in);
//        DAO dao = new DAO();
//
//        do {
//            System.out.println("\n________XIN MỜI CHỌN MỘT CHỨC NĂNG________");
//            System.out.println("1. Thêm 1 người mượn sách mới.");
//            System.out.println("2. Hiển thị danh sách những người mượn sách.");
//            System.out.println("3. Thêm 1 đầu sách mới.");
//            System.out.println("4. Hiển thị danh sách các đầu sách.");
//            System.out.println("5. Nhập thông tin Quản lý mượn sách.");
//            System.out.println("6. Sắp xếp thông tin mượn sách.");
//            System.out.println("7. Tìm kiếm thông tin người mượn sách theo tên.");
//            System.out.println("0. Thoát chương trình.");
//            System.out.println("Bạn chọn ? ");
//
//            choice = scanner.nextInt();
//            scanner.nextLine();// doc bo dong chua lua chon
//
//            switch (choice) {
//                case 0:
//                    System.out.println("____________Thoát khỏi chương trình____________");
//                    System.out.println("Cảm ơn quý vị đã sử dụng dịch vụ của chúng tôi!");
//                    break;
//
//                case 1:
//
//                    break;
//
//                case 2:
//
//                    break;
//
//                case 3:
//
//                    break;
//
//                case 4:
//
//                    break;
//
//                case 5:
//
//                    break;
//
//                    } while (true);
//
//            }
    }
}