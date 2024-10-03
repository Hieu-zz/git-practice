package qlnv.Controller;
import qlnv.Service.DepartmentService.DepartmentService;
import qlnv.Service.EmployeeService.EmployeeService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        DepartmentService departmentService = new DepartmentService();
        do {
            System.out.println("Moi chon cac danh muc sau");
            System.out.println("1-Hien thi danh sach nhan vien");
            System.out.println("2-Them nhan vien");
            System.out.println("3-Sua nhan vien");
            System.out.println("4-Xoa nhan vien");
            System.out.println("5-Hien thi danh sach phong");
            System.out.println("6-Them phong");
            System.out.println("7-Sua phong");
            System.out.println("8-Xoa phong");
            System.out.println("9- Hien thi phong ban trong");
            System.out.println("10- Hien thi phong ban khong trong");
            System.out.println("0-Thoát");
            System.out.println("-------------------------------------");
            System.out.println("moi nhap lua chon");
            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    employeeService.getAll();
                    break;
                case 2:
                    System.out.println("Moi nhap thong tin nhan vien");
                    employeeService.add();
                    break;
                case 3:
                    System.out.println("Moi nhap id nhan vien muon sua");
                    employeeService.updateById();
                    break;
                case 4:
                    System.out.println("Moi nhap id nhan vien muon xoa");
                    employeeService.deleteById();
                    break;
                case 5:
                    departmentService.getAll();
                    break;
                case 6:
                    System.out.println("Moi nhap thông tin phong");
                    departmentService.add();
                    break;
                case 7:
                    System.out.println("Moi nhap ten phong muon sua");
                    departmentService.updateByName();
                    break;
                case 8:
                    System.out.println("Moi nhap ten phong muon xoa");
                    departmentService.deleteByName();
                    break;
                case 9:
                    departmentService.emptyDepartment();
                    break;
                case 10:
                    departmentService.checkDepartment();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    break;
            }
        }while (true);

    }
}
