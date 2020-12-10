package Controller;

import java.util.Scanner;

public class CheckInput {
    static int inputNumber() throws Exception{
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        String str = scanner.nextLine();
        if (str.trim().isEmpty()){
            throw new Exception("Bạn chưa nhập sô");
        }
        so = Integer.parseInt(str);

        return so;
    }

     public static void checkNumber() {
        while (true) {
            try {
                int n;
                n = inputNumber();
                System.out.println(n + "\t");
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Lỗi: Đây ko phải số ");
            } catch (Exception ex) {
                System.out.println("Lỗi: " + ex.getMessage());
            }
        }

    }
}
