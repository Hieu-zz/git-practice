package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManager {
    static List<Student> students = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);

    public StudentManager() {
    }

    public static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("khong co sinh vien!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void findByNameOrId(){
        System.out.println("Nhap ten sinh vien:");
        String name= sc.nextLine();
        System.out.println("Nhap id cuar sinh vien");
        int id=sc.nextInt();
        for(Student student: students){
            if(student.getName().equalsIgnoreCase(name)|| student.getId()==id){
                System.out.println("thong tin sinh vien:" +student);
                return;
            }
        }
        System.out.println("Khoong tim thong tin sinh vien");
    }

    public static void addStudent(){
        System.out.println("id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("class:");
        String classs= sc.nextLine();
        System.out.println("age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("dob");
        String dob=sc.nextLine();

        Student s1 = new Student(id, name, classs, age, dob);
        students.add(s1);
        System.out.println("them sinh vien thanh cong");
    }

    public static Student getById(int id){
        for(Student student:students){
            if(student.getId()==id){
                return  student;
            }
        }
        return null;
    }

    public static void updateStudent(){
        System.out.println("Id sinh vien can sua doi");
        int id = sc.nextInt();
        sc.nextLine();
        Student s = getById(id);
        if(s!=null){
            System.out.println("new name");
            String name = sc.nextLine();
            s.setName(name);
            System.out.println("new class");
            String classs = sc.nextLine();
            s.setClasss(classs);
            System.out.println("new age");
            int age = sc.nextInt();
            s.setAge(age);
            sc.nextLine();
            System.out.println("new dob");
            String dob = sc.nextLine();
            s.setDob(dob);
            System.out.println("cap nhat thanh cong");
        }else{
            System.out.println("khong tim thay id cua sinh vien can sua doi");
        }
    }

    public static void deleteStudent(){
        System.out.println("Id sinh vien muon xoa:");
        int id = sc.nextInt();
        sc.nextLine();

        Student s=getById(id);
        if(s!=null){
            students.remove(s);
            System.out.println("xoa thong tin thanh cong");
        }else {
            System.out.println("khong tim thay sinh vien muon xoa");
        }
    }
}
