import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        double d, r ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chieu dai");
        d = sc.nextDouble();
        System.out.println("Moi nhap chieu rong");
        r = sc.nextDouble();
        double s = d*r;
        double p = (d+r)*2;
        System.out.println("dien tich hcn " + s);
        System.out.println("chu vi hcn " + p);
        int S = (int)s;
        int P = (int)p;
        System.out.println("dien tich hcn sau khi chuyen doi " + S);
        System.out.println("chu vi hcn sau khi chuyen doi " + P);
        System.out.printf("%.3f", s);
        System.out.format("%.3f",p );
        //coment fdhgdsugjfkdhj





    }
}
