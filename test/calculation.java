package test;
import java.util.Scanner;

public static void main(String[] args) {
    int firstNum, seccondNum;
    char calculation;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        firstNum = input.nextInt();
        System.out.print("Enter one more number: ");
        seccondNum = input.nextInt();
        System.out.print("Now enter your calculation: ");
        calculation = input.next().charAt(0);
    }
    switch (calculation) {
        case '+':
            System.out.println("Result: " + (firstNum + seccondNum));
            break;

        case '-':
            System.out.println("Result: " + (firstNum - seccondNum));
            break;

        case '*':
            System.out.println("Result: " + (firstNum * seccondNum));
            break;

        case '/':
            if (seccondNum != 0) {
                System.out.println("Result: " + (firstNum / seccondNum));
            } else {
                System.out.println("Cannot be divided by 0!");
            }
            break;

        default:
            System.out.println("Error getting calculation!");
            break;
    }
}