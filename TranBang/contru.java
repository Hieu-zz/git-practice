package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen: ");
        System.out.println("so nguyen 1: ");
        int a = s.nextInt();
        System.out.println("so nguyen 2: ");
        int b = s.nextInt();
        System.out.println("ban muon + - * / : ");
        String c= s.next();

        switch (c){
            case "+":
                System.out.println("Ket qua phep tinh" + (a+b));
                break;
            case "-":
                System.out.println("Ket qua phep tinh" + (a-b));
                break;
            case "*":
                System.out.println("Ket qua phep tinh" + (a*b));
                break;
            case "/":
                if(b==0) System.out.println("looi kh tinh duoc");
                else  {
                    System.out.println("Ket qua phep tinh" + (a/b));
                    break;
                }
            default:
                System.out.println("");
                break;
        }


    }

}