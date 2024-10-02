import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        char key='?';
        int count=1;
        while(c!=key){
            if(count<=2){
                c=sc.next().charAt(0);
                count++;
            }else{
                break;
            }
        }
        if(c==key){
            System.out.println("Đăng nhập thành công!!!");
        }else{
            System.out.println("Nhập sai quá nhiều lần!!!");
        }
    }
}
