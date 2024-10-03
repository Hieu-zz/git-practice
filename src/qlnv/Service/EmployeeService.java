package qlnv.Service;

import qlnv.Modal.Employee;
import qlnv.Service.IEmployeeService.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
     public List<Employee> list =new ArrayList<>();

    public EmployeeService() {
        Employee employee = new Employee(1L,"tuan",20,"22/2/2003","03599","nhan vien");
        Employee employee1 = new Employee(2L,"dung",19,"32/2/2003","323299","nhan vien");
        Employee employee2 = new Employee(3L,"kien",50,"32/2/1990","323299","sep");
        this.list.add(employee);
        this.list.add(employee1);
        this.list.add(employee2);
    }

    @Override
    public List<Employee> getAll() {
            return list;
    }

    @Override
    public List<Employee> add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id ");
        long id = scanner.nextInt();
        System.out.println("Nhâp name :");
        String name = scanner.next();
        System.out.println("Nhập age :");
        int age = scanner.nextInt();
        System.out.println("nhập DOB :");
        String dob = scanner.next();
        System.out.println("nhập phone :");
        String phone = scanner.next();
        System.out.println("nhập workAs");
        String workAs = scanner.next();
        Employee employee = new Employee(id,name,age,dob,phone,workAs);
        list.add(employee);
        return list;
    }

    @Override
    public List<Employee> fix( long id ) {
        Scanner scanner = new Scanner(System.in);
        for (Employee list: list
             ) {
            if (list.getId()==id){
                System.out.println(list.getName());
                System.out.println(list.getAge());
                System.out.println(list.getDOB());
                System.out.println(list.getPhoneNUmber());
                System.out.println(list.getWorkAs());
                System.out.println("nhập thông tin cần sửa");
                System.out.println("nhập tên cần sửa");
                String name = scanner.next();
                if(name.isEmpty()){
                    list.setName(list.getName());
                }else {
                    list.setName(name);
                }
                System.out.println("nhập tuổi cần sửa");
                String age1 = scanner.next();
                if(age1.isEmpty()){
                    list.setAge(list.getAge());
                }else {
                    int age = Integer.parseInt(age1);
                    list.setAge(age);
                }
                System.out.println("nhập DOB :");
                String dob = scanner.next();
                if(dob.isEmpty()){
                    list.setDOB(list.getDOB());
                }else {
                    list.setDOB(dob);
                }
                System.out.println("nhập phone :");
                String phone = scanner.next();
                if(phone.isEmpty()){
                    list.setPhoneNUmber(list.getPhoneNUmber());
                }else {
                    list.setPhoneNUmber(phone);
                }
                System.out.println("nhập workAs");
                String workAs = scanner.next();
                if(workAs.isEmpty()){
                    list.setWorkAs(list.getWorkAs());
                }else {
                    list.setWorkAs(workAs);
                }



            }
        }
        return list;
    }

    @Override
    public void delete(long id) {
        for (Employee e: list
             ) {
            if(e.getId()==id){
                list.remove(e);
                break;
            }
        }

    }
}
