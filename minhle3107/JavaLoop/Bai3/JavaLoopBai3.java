package Bai3;

import java.util.Scanner;

/*
Bài 3:
Viết ứng dụng JAVA yêu cầu:
- Người nhập vào 1 kí tự.
- Nếu kí tự không đúng thì sẽ yêu cầu người dùng nhập lại.
- Nhập sai 3 lần thì dừng ứng dụng.
- Nhập đúng thì hiển thị thông báo : "Đăng nhập thành công".

 */
public class JavaLoopBai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char key = 'c';
        int count = 0;
        do {
            System.out.println("Nhập vào ký tự: ");
            char text = s.next().charAt(0);
            if (key == text) {
                System.out.println("Đăng nhập thành công");
                break;
            } else {
                count++;
                System.out.println("Thông tin không chính xác");
            }

        } while (count < 3);
    }
}
