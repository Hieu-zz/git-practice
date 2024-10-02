import java.util.Scanner;
public class bai2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập chiều dài");
            double a = scanner.nextDouble();
            System.out.println("nhập chiều rộng");
            double b = scanner.nextDouble();
            double c = a+b;
            double s = a*b;
            System.out.println("chu vi hình chữ nhật là :"  + c );
            System.out.println("diện tích hình chữ nhật là : " + s);
            int convertC = (int)c;
            int convertS =(int)s;
            System.out.println("chu vi hình chữ nhật là :"  + convertC);
            System.out.println("diện tích hình chữ nhật là : " + convertS );
            //in ra 3 so sau dau phay
            System.out.printf( "c = %.3f /t s=%.3f " ,   c , s  );

        }
    };
