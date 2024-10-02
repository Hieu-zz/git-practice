import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s1 = s.next();

        StringBuilder s2 = new StringBuilder(s1);

        if(s1.equals(s2.reverse().toString())){
            System.out.println("Đối xứng");
        }else {
            System.out.println("Ko dối xứng");
        }

        if(check(s1)){
            System.out.println("Đối xứng");
        }else {
            System.out.println("Ko dối xứng");
        }
    }

    public static boolean check (String s1){
        char[] s4 = s1.toCharArray();
        int n = s1.length();
        for (int i=0; i<n/2;i++){
            if(s4[i] != s4[n-1-i]){
                return false;
            }
        }
        return  true;
    }
}
