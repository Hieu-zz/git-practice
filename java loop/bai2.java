import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();sc.nextLine();
        System.out.println("Lựa chọn phép tính: ");
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
       String select=sc.nextLine();
        switch (select){
            case "+":
                System.out.println("Kết quả của phép tính là: "+(a+b));
                break;
            case "-":
                System.out.println("Kết quả của phép tính là: "+(a-b));
                break;
            case "*":
                System.out.println("Kết quả của phép tính là: "+(a*b));
                break;
            case "/":
                if(b==0){
                    System.out.println("Không thể thực hiện phép chia 0");
                }else{
                    System.out.println(a/b);
                }
                break;
            default:
                System.out.println("Nhập không hợp lệ!!!");
        }
    }
}
