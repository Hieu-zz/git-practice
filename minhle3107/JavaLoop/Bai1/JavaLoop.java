package Bai1;

import java.util.Scanner;

public class JavaLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numbers = new int[3];

        // nhập vào
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập vào số thứ " + i);
            numbers[i] = s.nextInt();
        }


        int max = numbers[0];
        boolean check = false;
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            } else if (max == numbers[i]) {
                check = true;
            }
        }

        if (check) {
            System.out.println("Số lớn nhất bằng nhau " + max);
        } else {
            System.out.println("Số lớn nhất là: " + max);
        }

    }
}
