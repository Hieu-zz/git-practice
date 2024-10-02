import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double chieuDai, chieuRong;

        System.out.print("Nhập vào chiều dài: ");
        chieuDai = s.nextDouble();

        System.out.print("Nhập vào chiều rộng: ");
        chieuRong = s.nextDouble();

        System.out.printf("Chiều dài của hình chữ nhật là: %.3f \n", chieuDai);
        System.out.printf("Chiều rộng của hình chữ nhật là: %.3f \n", chieuRong);

        // convert double sang int
        int chuVi = (int) (chieuDai + chieuRong);

        // convert double sang int
        int dienTich = (int) (chieuDai * chieuRong);

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);


    }
}