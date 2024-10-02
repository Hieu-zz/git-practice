package Bai2;

import java.util.Scanner;

/*
Bài 2:
Viết ứng dụng java yêu cầu:
- Người dùng nhập 2 số nguyên.
- Người dùng nhập 1 toán tử (+, -, *, /).
- In ra lỗi nếu người dùng chia cho 0.
 */
public class JavaLoopBai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên thứ nhất: ");
        int so1 = s.nextInt();

        System.out.println("Nhập vào số nguyên thứ hai: ");
        int so2 = s.nextInt();

        System.out.println("Nhập vào 1 trong các toán tử sau: +, -, *, /");

        String toanTu = s.next();

        switch (toanTu) {
            case "+":
                System.out.println("Tổng 2 số là: " + (so1 + so2));
                break;
            case "-":
                System.out.println("Hiệu 2 số là: " + (so1 - so2));
                break;

            case "*":
                System.out.println("Tích 2 số là: " + (so1 * so2));
                break;

            case "/":
                if (so2 == 0) {
                    System.out.println("Lỗi, không được chia cho 0!");
                } else {

                    System.out.println("Thương 2 số là: " + (so1 / so2));
                }
                break;

            default:
                System.out.println("Bạn đã nhập sai");
        }
    }
}
