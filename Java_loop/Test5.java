package Java_loop;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        String a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuoi");
        a = sc.nextLine();
        StringBuilder b = new StringBuilder(a);
        if (a.equals(b.reverse().toString())){
            System.out.println("Chuoi doi xung");
        }else{
            System.out.println("Chuoi k doi xung");
        }
    }
}
