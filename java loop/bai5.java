import java.util.Scanner;

public class bai5 {
    public static Student studentService=new Student();
    public static final Scanner sc=new Scanner(System.in);
    public static int menu(){
        System.out.println("Chọn hành động:");
        System.out.println("1.Xem tất cả nhân viên");
        System.out.println("2.Thêm nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Sửa nhân viên");
        System.out.println("5. Tìm nhân viên theo id");
        System.out.println("6. Tìm nhân viên theo tên");
        System.out.println("7. Thoát");
        int select=sc.nextInt();sc.nextLine();
        return select;
    }
    public static void main(String[] args) {
        studentService.insert(new Student(1,"Duong","21CN3",19,"26/12/2003"));
        studentService.insert(new Student(2,"Duong1","21CN3",19,"27/12/2003"));
        studentService.insert(new Student(3,"Duong2","21CN3",19,"28/12/2003"));
        studentService.insert(new Student(4,"Duong3","21CN3",19,"29/12/2003"));
        studentService.insert(new Student(5,"Duong4","21CN3",19,"30/12/2003"));
        boolean check=true;
        while(check){
        switch(menu()){
            case 1:
                for (Student student:studentService.getAll()){
                    System.out.println(student.toString(student));
                }
                break;
            case 2:
                System.out.println("Nhập id sinh viên: ");
                int id=sc.nextInt();sc.nextLine();
                System.out.println("Nhập tên sinh viên: ");
                String name=sc.nextLine();
                System.out.println("Nhập lớp: ");
                String lop=sc.nextLine();
                System.out.println("Nhập tuổi: ");
                int age=sc.nextInt();sc.nextLine();
                System.out.println("Nhập ngày tháng năm sinh: ");
                String dob=sc.nextLine();
                studentService.insert(new Student(id,name,lop,age,dob));
                break;
            case 3:
                System.out.println("Nhập id sinh viên muốn xóa: ");
                studentService.deleteById(sc.nextInt());
                break;
            case 4:
                System.out.println("Nhập id sinh viên muốn sửa: ");
                int selected_id=sc.nextInt();sc.nextLine();
                System.out.println("Nhập tên sinh viên: ");
                String new_name=sc.nextLine();
                System.out.println("Nhập lớp: ");
                String  new_lop=sc.nextLine();
                System.out.println("Nhập tuổi: ");
                int  new_age=sc.nextInt();sc.nextLine();
                System.out.println("Nhập ngày tháng năm sinh: ");
                String  new_dob=sc.nextLine();
                studentService.update(selected_id,new Student(selected_id,new_name,new_lop,new_age,new_dob));
                break;
            case 5:
                System.out.println("Nhâp id sinh viên muốn tìm: ");
                int slt_id=sc.nextInt();
                Student student=studentService.getById(slt_id);
                System.out.println(studentService.toString(student));
                break;
            case 6:
                System.out.println("Nhập tên sinh viên muốn tìm: ");
                String name1=sc.nextLine();
                for (Student student1: studentService.getAllByName(name1)){
                    System.out.println(student1.toString(student1));
                }
                break;
            case 7:
                check=false;
                break;
            default:
                System.out.println("Nhập không hợp lệ");
        }
        }








//        for (Student student:studentService.getAll()){
//            System.out.println(student.toString(student));
//        }
//        System.out.println(studentService.getById(1).toString(studentService.getById(1)));
//        Student new_student=new Student(1,"DƯƠNG","21CN5",21,"21/12/2005");
//        studentService.update(new_student.getId(),new_student);
//        for (Student student:studentService.getAll()){
//            System.out.println(student.toString(student));
//        }
//         studentService.deleteById(1);
//        for (Student student:studentService.getAll()){
//            System.out.println(student.toString(student));
//        }
    }
}
