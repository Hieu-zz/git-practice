import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b=scanner.nextDouble();
        double cv = (a+b)*2;
        double dt = a*b;
        //Chu vi + diện tích
        System.out.println("chu vi: "+ cv);
        System.out.println("Diện tích: "+ dt);
        //Convert
        int cv1 = (int)cv;
        int dt1 = (int)dt;
        System.out.println("Chu vi: "+ cv1);
        System.out.println("Diện tích: "+ dt1);
        //3 số sau .
        System.out.println("3 số sau .");
        System.out.format("%.3f",cv);
        System.out.println("");
        System.out.format("%.3f",dt);
    }
}
