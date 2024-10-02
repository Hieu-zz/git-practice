import java.util.Scanner;

static boolean isPalindrome(String str) {
    for (int i = 0, j = (str.length() - 1); i < j; i++, j--) {
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    String str;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter the string: ");
        str = input.nextLine();
    }
    System.out.println(isPalindrome(str));
}
