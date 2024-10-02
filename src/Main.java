import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static   List<Student> studentList = new ArrayList<>();
    Student student = new Student();
    public String main_menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn một trong các tùy chọn:");
        System.out.println("a. Thêm ");
        System.out.println("b. show ");
        System.out.println("c. sửa ");
        System.out.println("d. xóa");
        System.out.println("e. lấy sinh viên");
        System.out.println("d. Thoát");
        System.out.println("chọn chức năng sử dụng");
        String select = scanner.next();
        return select;
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap id :");
//        int id = scanner.nextInt();
//        System.out.println("nhap name :");
//        String name = scanner.next();
//        System.out.println("nhap class :");
//        String className = scanner.next();
//        System.out.println("nhap age :");
//        int age = scanner.nextInt();
//        System.out.println("nhap DOB :");
//        String date = scanner.next();
//
//
//        Student student = new Student();
//
//        student.setId(id);
//        student.setName(name);
//        student.setClassName(className);
//        student.setAge(age);
//        student.setDOB(date);
//        studentList.add(student);

            // Dữ liệu tĩnh cho sinh viên
            int id = 1;
            String name = "Nguyen Van A";
            String className = "21CN3";
            int age = 20;
            String date = "01/01/2003";

            // Tạo đối tượng Student
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setClassName(className);
            student.setAge(age);
            student.setDOB(date);

            // Thêm sinh viên vào danh sách
            studentList.add(student);

            // Thêm một sinh viên khác (nếu muốn)
            id = 2;
            name = "Le Thi B";
            className = "21CN4";
            age = 22;
            date = "02/02/2002";

            Student student2 = new Student();
            student2.setId(id);
            student2.setName(name);
            student2.setClassName(className);
            student2.setAge(age);
            student2.setDOB(date);

            studentList.add(student2);




    };
    public void show(){
        for (Student s:studentList
        ) {
            System.out.println(s);
        }
    }

    public void deleteByid(int id1){
        for (Student s: studentList
             ) {
            if(s.getId()==id1){
                studentList.remove(s);
            }
        }
    }
    public void getStudent(String name){
        for (Student s: studentList
             ) {
            if(s.getName().equals(name)){
                System.out.println(s);
            }
        }
    }
    public void update(int id){
        for (Student s: studentList
        ) {
            if(s.getId()==id){

                System.out.println(s.getName());
                System.out.println(s.getClassName());
                System.out.println(s.getAge());
                System.out.println(s.getDOB());
                s.setName("tuan");
                s.setClassName("21cn3");
                s.setAge(20);
                s.setDOB("q");
            }

        }
    }





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        boolean check = true;

        while (check) {
            System.out.println("nhap lua chon");
            String select = main.main_menu();
            switch (select) {
                case "a":
                    main.add();

                    break;
                case "b":
                    main.show();

                    break;
                case "c":
                    main.update(2);
                    break;
                case "d":
                    int id1 = scanner.nextInt();
                    main.deleteByid(id1);
                    break;
                case "e":
//                    int id = scanner.nextInt();
                    String name = scanner.next();
                    main.getStudent(name);

                    break;
                case "f":
                    check = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        }

    }
}