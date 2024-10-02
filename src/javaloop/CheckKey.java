package javaloop;

import java.util.Scanner;

public class CheckKey {
    public void findKey() {
        Scanner sc = new Scanner(System.in);

        char key = 'a';


        int soLan = 0;
        while (soLan <= 2) {

            System.out.println("Nhập vào 1 kí tự: ");
            char keyInput = sc.next().charAt(0);

            if (key == keyInput) {
                System.out.println("Nhập key thành công !");
                break;
            }

            soLan++;
        }


    }
}
