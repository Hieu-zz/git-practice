import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Kí tự cần đoán
        char correct = 'g';
        //số lần được đoán
        int guess = 3;
        int count = 0;

        while (guess < 4) {
            System.out.println("Hãy nhập kí tự bạn đoán: ");
            char res = s.next().charAt(0);

            if (res == correct) {
                System.out.println("Đăng nhập thành công");
                break;
            } else {
                count++;
                if (count < guess) {
                    System.out.println("Kí tự chưa đúng! Vui lòng thử lại!!!");
                } else {
                    System.out.println("Bạn nhập sai 3 lần.Dừng chương trình!!!");
                    break;
                }
            }
        }

    }
}
