package test;

import Model.Department;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        StringTokenizer token = new StringTokenizer(";*!str", ";*!");
        System.out.println(token);

        // In ra từng phần tử
        while (token.hasMoreTokens()) {
            token.nextToken();
            System.out.println(cnt);
            cnt++;
        }
        System.out.println(cnt);
    }
}
