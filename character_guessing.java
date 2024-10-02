import java.util.Scanner;

public static void main(String[] args) {
    char key = 'H';
    char password;
    int count = 0;
    try (Scanner input = new Scanner(System.in)) {
        do {
            System.out.print("Guess the secret character: ");
            password = input.next().charAt(0);
            if (password != key) {
                count++;
                System.out.println((3 - count) + " try remaining!");
                if (count == 3) {
                    System.out.println("Uh oh, you didn't pass the gate bro");
                    return;
                }
            } else {
                System.out.println("Congrats, you have been rewarded by guessing the character");
            }
        } while (password != key);
    }
}