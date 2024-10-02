import javaloop.FindMaxNumber;
import javaloop.MathNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        double width = scanner.nextDouble();
        System.out.println("Height: ");
        double height = scanner.nextDouble();
        double dienTich = width * height;
        double chuVi = (width + height) * 2;
        System.out.println("Dien tich nguyen la: " + (int) dienTich);
        System.out.println("Chu vi nguyen la: " + (int) chuVi);
        System.out.println("Dien tich thuc la:  " +  String.format("%.3f", dienTich));
        System.out.println("Chu vi thuc la: " +String.format("%.3f", chuVi)); */

//        FindMaxNumber findMaxNumber = new FindMaxNumber();
//        findMaxNumber.findMaxNumber();

        MathNumber mathNumber = new MathNumber();
        mathNumber.TinhGiaTri();
    }
}