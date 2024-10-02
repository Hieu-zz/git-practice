package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Student Management");
            System.out.println("1. View all students");
            System.out.println("2. Find by name or ID");
            System.out.println("3. Add student");
            System.out.println("4. Edit student");
            System.out.println("5. Delete student by ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    StudentManager.viewAllStudents();
                    break;
                case 2:
                    StudentManager.findByNameOrId();
                    break;
                case 3:
                    StudentManager.addStudent();
                    break;
                case 4:
                    StudentManager.updateStudent();
                    break;
                case 5:
                    StudentManager.deleteStudent();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("re-enter");
            }
        }

    }
}










