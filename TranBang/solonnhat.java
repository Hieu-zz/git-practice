package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 3 so nguyen: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max =a;
        if(b>max) max=b;
        if(c>max) max=c;
        if ((a == max && b == max) || (a == max && c == max) || (b == max && c == max)) {
            System.out.println("Số lớn nhất bằng nhau: " + max);
        } else {
            System.out.println("Số lớn nhất là: " + max);
        }


    }




}