package Java_loop;

import java.util.ArrayList;
import java.util.Scanner;

public class qlsv {
    public static void main(String[] args) {
            SinhVien sv = new SinhVien();
            SinhVien sv1 = new SinhVien("Nguyen Van A","1/1/2004","A3","a1234", 20);
            SinhVien sv2 = new SinhVien("Nguyen Van B","1/2/2004","A3","b1234", 20);
            SinhVien sv3 = new SinhVien("Nguyen Van C","1/3/2004","A3","c1234", 20);
            ArrayList<SinhVien> arr = new ArrayList<SinhVien>();
            arr.add(sv1);
            arr.add(sv2);
            arr.add(sv3);
            sv.listSv(arr);
            System.out.println("------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi nhap ten sinh vien");
            String name = sc.nextLine();
            System.out.println("Moi nhap ngay thang nam sinh");
            String DOB = sc.nextLine();
            System.out.println("Moi nhap lop");
            String classRoom = sc.nextLine();
            System.out.println("Moi nhap id");
            String id = sc.nextLine();
            System.out.println("Moi nhap tuoi");
            int age = sc.nextInt();
            SinhVien sv4 = new SinhVien(name,DOB,classRoom,id,age);
            sv4.addSinhVien(sv4, arr);
            sv.listSv(arr);
            System.out.println("------------------");
            System.out.println("moi nhap ten hoac id");
            String key = sc.nextLine();
            sv.findSV(key, arr);
            System.out.println("------------------");
            System.out.println("moi nhap id");
            String id1 = sc.nextLine();
            sv.updateSv(id1, arr);
            System.out.println("------------------");
            System.out.println("moi nhap id");
            String id2 = sc.nextLine();
            sv.deleleSv(id2,arr);
            sv.listSv(arr);
        }
    }
