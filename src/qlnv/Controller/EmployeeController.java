package qlnv.Controller;

import qlnv.Modal.Employee;
import qlnv.Service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeController {



        public String main_menu() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn một trong các tùy chọn:");
            System.out.println("a. Thêm ");
            System.out.println("b. sửa ");
            System.out.println("c. xóa ");
            System.out.println("d. hiển thị danh sách sv");
            System.out.println("e. Thoát");
            System.out.println("chọn chức năng sử dụng");
            String select = scanner.next();
            return select;
        }
        public void getAll(EmployeeService employeeService){
            List<Employee> list = employeeService.getAll();
            for (Employee l: list
                 ) {
                System.out.println(l.toString());
            }

        }
       public void add(EmployeeService employeeService){
            employeeService.add();
       }
       public void delete(EmployeeService employeeService ,long id ){
            employeeService.delete(id);
       }
       public void fix(EmployeeService employeeService,long id){

            employeeService.fix(id);
       }



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            EmployeeController main = new EmployeeController();
            EmployeeService employeeService = new EmployeeService();
//            employeeService.avaiableEmployee();
            boolean check = true;
            while (check) {
                System.out.println("nhap lua chon");
                String select = main.main_menu();
                switch (select) {
                    case "a":
                        main.add(employeeService);

                        break;
                    case "b":
                        main.fix(employeeService,1);

                        break;
                    case "c":
                        long id = scanner.nextLong();
                        main.delete(employeeService,id);
                        break;
                    case "d":
                        main.getAll(employeeService);
                        break;
                    case "e":
                        check = false;
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");

                }
            }

        }
    }
