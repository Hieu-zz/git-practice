import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        float a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.printf("Chu vi: "+(int)((a+b)*2)+"\n");
        System.out.printf("Dien tich: "+(int)(a*b)+"\n");
        System.out.printf("3 so sau dau phay la: %4.3f",(a*b));//VietDuong
    }
}
