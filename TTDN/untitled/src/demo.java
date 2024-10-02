import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        byte byteValue = scanner.nextByte();
        int intValue = scanner.nextInt();
        float floatValue = scanner.nextFloat();
        long longValue = scanner.nextLong();
        double doubleValue = scanner.nextDouble();

        System.out.println("value:");
        System.out.println(byteValue + " " + intValue + " " + floatValue + " " + longValue + " " + doubleValue + " ");
    }
}
