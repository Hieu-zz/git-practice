import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int firstNum, secondNum, thirdNum;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Nhap so thu 1: ");
        firstNum = input.nextInt();
        System.out.print("Nhap so thu 2: ");
        secondNum = input.nextInt();
        System.out.print("Nhap so thu 3: ");
        thirdNum = input.nextInt();
    }
    list.add(firstNum);
    list.add(secondNum);
    list.add(thirdNum);
    int max = firstNum;
    int count = 0;
    for (int num : list) {
        if (num > max) {
            max = num;
        }
    }
    for (int num : list) {
        if (num == max) {
            count++;
        }
    }
    if (count > 1) {
        System.out.println("So lon nhat bang nhau: " + max);
    } else {
        System.out.println("So lon nhat: " + max);
    }
}