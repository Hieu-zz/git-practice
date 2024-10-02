import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[]substr=str.split("");
        String[]rvsubstr=new String[substr.length];
        int i=0;
        int j= rvsubstr.length-1;
        while(i<substr.length && j>=0){
            rvsubstr[j]=substr[i];
            i++;
            j--;
        }
        boolean check=true;
        for (int k = 0; k < substr.length; k++) {
            if(rvsubstr[k].equals(substr[k])){
                check=true;
            }else{
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("Hop le");
        }else{
            System.out.println("Khong hop le");
        }
    }
}
