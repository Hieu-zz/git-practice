package javaloop;

import java.util.Scanner;

public class CheckDoiXung {
    public void check(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        String input = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder(input);

        if(input.equals(stringBuilder.reverse().toString())){
            System.out.println("Đây là chuỗi đối xứng");
        }else{
            System.out.println("Không phải chuỗi đối xứng");
        }




    }
}
