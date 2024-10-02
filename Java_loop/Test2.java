package Java_loop;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen thu nhat");
        a = sc.nextInt();
        System.out.println("Moi nhap so nguyen thu hai");
        b = sc.nextInt();
        System.out.println("Moi nhap so nguyen thu ba");
        c = sc.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("So lon nhat " + max);
        if ((max == b || max == c) || ( max == b && max ==c)) {
            System.out.println("So lon nhat bang nhau");
        }

    }
}
