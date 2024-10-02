import java.util.Scanner;

public class DemoB2 {
    public static void main(String[] args) {
        System.out.println("Nhập 3 số nguyên: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        System.out.println("số max : " + max);

        if (a == b && b == c) {
            System.out.println("Số lớn nhất bằng nhau");
        } else if (a == max && b == max && c != max || a == max && b != max && c == max || a != max && b == max && c == max) {
            System.out.println("Có 2 số lớn nhất");
        }else {
            System.out.println("Chỉ có 1 số lớn nhất");
        }


    }
}
