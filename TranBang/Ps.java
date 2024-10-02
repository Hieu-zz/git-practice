package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        double a = s.nextDouble();
        System.out.println("nhap chieu rong: ");
        double b = s.nextDouble();
        System.out.println("Chu vi hinh chu nhat la:" + (int)((a+b)*2));
        System.out.println("Dien tich hinh chu nhat la :" + (int)(a*b));

        System.out.printf("Chieu dai hình chữ nhật: %.3f\n", a);
        System.out.printf("Chieu rong hình chữ nhật: %.3f\n", b);

    }
}