import java.util.Scanner;

public class demoB2_2 {
    public static void main(String[] args) {
        System.out.println("Nhập 2 số nguyên: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Nhập lựa chọn: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");

        int opt = s.nextInt();
         double result;

         switch (opt){
             case 1:
                 result = a+b;
                 System.out.println("Tống 2 số là : " +result);
                 break;
             case 2:
                 result = a - b;
                 System.out.println("Hiệu 2 số là: "+result);
                 break;
             case 3:
                 result = a*b;
                 System.out.println("Tích 2 số: "+ result);
                 break;
             case 4:
                 if(b != 0) {

                     result = (double) a / b;
                     System.out.println("Thương 2 số là: " + result);
                 }else {
                     System.out.println("Lỗi: Không thể chia cho 0");
                 }
                 break;
         }

    }
}
