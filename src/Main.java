import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        String operator = scanner.next();
        switch (operator) {
            case "+" :
                double cong = a+b;
                System.out.println(cong);
                break;
            case  "-":
                double tru = a-b;
                System.out.println(tru);
                break;
            case "*":
                double nhan = a*b;
                System.out.println(nhan);
                break;
            case "/":

                if(b == 0){
                    System.out.println("lỗi cú pháp");
                }else {
                    System.out.println(a/b);
                }


                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}