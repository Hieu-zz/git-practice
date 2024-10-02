package Java_loop;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        char a = 'j';
        int i = 0;
        char b ;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println("Moi nhap ky tu");
           b = sc.next().charAt(0);
           if (a == b ){
               System.out.println("Mat khau dung");
               break;
           }else {
               System.out.println("Mat khau k dung");
               i++;
           }
       }
       while (i<3);
    }
}
