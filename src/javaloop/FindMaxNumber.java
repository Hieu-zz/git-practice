package javaloop;

import java.util.Scanner;

public class FindMaxNumber {

   public void findMaxNumber() {
       Scanner scanner = new Scanner(System.in);


       System.out.print("Nhập số thứ nhất: ");
       int num1 = scanner.nextInt();

       System.out.print("Nhập số thứ hai: ");
       int num2 = scanner.nextInt();

       System.out.print("Nhập số thứ ba: ");
       int num3 = scanner.nextInt();


       int max = Math.max(num1, Math.max(num2, num3));


       if (num1 == max && num2 == max && num3 == max) {
           System.out.println("Số lớn nhất bằng nhau");
       } else if (num1 == max && num2 == max || num2 == max && num3 == max || num1 == max && num3 == max) {
           System.out.println("Số lớn nhất bằng nhau");
       } else {
           System.out.println("Số lớn nhất là: " + max);
       }

   }


}
