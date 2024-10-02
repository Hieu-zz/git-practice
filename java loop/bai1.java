import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[]arr={a,b,c};
        int max=arr[0];
        int count=0;
        for(Integer idx:arr){
            if(idx>max){
                max=idx;
            }
        }
        for(Integer idx:arr){
            if(idx==max){
                count++;
            }
        }
        if(count==1){
            System.out.println("Số lớn nhất là: "+max);
        }else{
            System.out.println("Số lớn nhất bằng nhau và bằng "+max);
        }
    }
}
