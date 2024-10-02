package Java_loop;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    String name, DOB, classRoom, id;
    int age;

    public SinhVien() {
    }

    public SinhVien(String name, String DOB, String classRoom, String id, int age) {
        this.name = name;
        this.DOB = DOB;
        this.classRoom = classRoom;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void listSv(ArrayList<SinhVien> arr){
         for (SinhVien i : arr) {
                System.out.println(i.toString());
           }
    }

    public void addSinhVien(SinhVien sv, ArrayList<SinhVien> arr) {
        arr.add(sv);
    }

    public void findSV(String key, ArrayList<SinhVien> arr) {
        ArrayList<SinhVien> arr1 = new ArrayList<SinhVien>();
        for (SinhVien i : arr) {
            if (key.equals(i.getName()) || key.equals(i.getId())) {
                arr1.add(i);
            }
        }
        listSv(arr1);

    }

    public void deleleSv(String id,ArrayList<SinhVien> arr){
        for (SinhVien i : arr) {
            if (id.equals(i.getId())) {
               arr.remove(i);
            }
        }
    }

    public void updateSv(String id,ArrayList<SinhVien> arr) {
        for (SinhVien i : arr) {
            if (id.equals(i.getId())) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Moi nhap ten sinh vien");
                String name = sc.nextLine();
                System.out.println("Moi nhap ngay thang nam sinh");
                String DOB = sc.nextLine();
                System.out.println("Moi nhap lop");
                String classRoom = sc.nextLine();
                System.out.println("Moi nhap id");
                String id1 = sc.nextLine();
                System.out.println("Moi nhap tuoi");
                int age = sc.nextInt();
                i.setName(name);
                i.setDOB(DOB);
                i.setClassRoom(classRoom);
                i.setId(id1);
                i.setAge(age);
            }
        }
    }
}