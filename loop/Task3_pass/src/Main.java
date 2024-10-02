import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char pass = 'z';
        Scanner sc = new Scanner(System.in);

        int cnt = 1;

        while(cnt <= 3) {
            System.out.print("your pass = ");
            char c = sc.next().charAt(0);
            if(c == pass){
                System.out.println("access");
                break;
            }else
                System.out.println("denide");
            cnt++;
        }
    }
}