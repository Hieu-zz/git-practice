package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char x= 'a';
        int count=0;
        Scanner s = new Scanner(System.in);
        while (count<3){
            System.out.println("hay nhap 1 ki tu: ");
            char y = s.next().charAt(0);
            if(y==x) {
                System.out.println("Dang nhap thanh cong");
                break;
            }else {
                count ++;
                System.out.println("Hay nhap lai");
            }
        }
        if(count ==3) s.close();
    }
}