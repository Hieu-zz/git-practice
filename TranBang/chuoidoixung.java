package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("hay nhap 1 chuoi:");
        StringBuilder x = new StringBuilder(s.nextLine());

        StringBuilder y = x.reverse();
        if(x==y){
            System.out.println("chuoi doi xung");
        };
    }
}

