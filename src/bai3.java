import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        for (int i =1 ; i <=3 ; i++){
            String key = "c";
            Scanner sc = new Scanner(System.in);
            String nhap = sc.next();
            if(key.equals(nhap)){
                System.out.println("dang nhap thanh cong ");
            }
            if(!nhap.equals(key)){
                System.out.println("nhập lại ");
            }if((i == 3) & (!nhap.equals(key)) ){
                System.out.println("out");
            }
        }


    }
}
