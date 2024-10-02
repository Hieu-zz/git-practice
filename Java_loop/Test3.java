package Java_loop;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int a, b;
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so thu nhat");
        a = sc.nextInt();
        System.out.println("Moi nhap so thu hai");
        b = sc.nextInt();
        System.out.println("Moi nhap phep toan");
        c = sc.next();

        switch (c){
            case "+" :
                int tong = a+b;
                System.out.println("Tong hai so " + tong);
                break;
            case "-" :
                int hieu = a-b;
                System.out.println("hieu hai so " + hieu);
                break;
            case "*" :
                int tich = a*b;
                System.out.println("tich hai so " + tich);
                break;
            case "/" :
                if (b == 0){
                    System.out.println("Loi so chia phai khac 0");
                } else {
                    double thuong = (double)a/b;
                    System.out.println("thuong hai so ");
                    System.out.printf("%.3f",thuong);
                }
                break;
            default:
                System.out.println("Moi nhap phep toan + - * /");
                break;
        }
    }
}
