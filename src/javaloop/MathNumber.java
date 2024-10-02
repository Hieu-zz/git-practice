package javaloop;

import java.util.Scanner;

public class MathNumber {
    public void TinhGiaTri() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.println("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        System.out.println("Nhập vào toán tử: ");
        char toanTu = sc.next().charAt(0);

        switch (toanTu) {
            case '+':
                System.out.println("Tổng 2 số a và b là :" + (a + b));
                break;
            case '-':
                System.out.println("Hiệu 2 số a và b là :" + (a - b));
                break;
            case '*':
                System.out.println("Tích 2 số a và b là :" + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Không thể chia cho 0 !");
                } else {
                    System.out.println("Thương 2 số a và b là :" + (a / b));
                }
                break;
            default:
                System.out.println("Vui lòng chọn đúng toán tử");
        }
    }
}
