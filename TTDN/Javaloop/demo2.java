import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        System.out.println("Nhập 2 số nguyên: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Nhập lựa chọn");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        int opt = s.nextInt();
        double res;
        switch (opt){
            case 1:
                res = a+b;
                System.out.println("a+b="+ res);
                break;
            case 2:
                res = a-b;
                System.out.println("a-b="+res);
                break;
            case 3:
                res = a*b;
                System.out.println("a*b="+res);
                break;
            case 4:
                if(b!=0){
                    res = (double) a/b;
                    System.out.println("a/b="+res);
                }else {
                    System.out.println("Lỗi");
                }
                break;
        }

    }


}
