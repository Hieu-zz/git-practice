package qlnv.Service.EmployeeService;

import qlnv.Model.Employee;
import qlnv.Service.DepartmentService.DepartmentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeService implements IEmployeeService{
    List<Employee> employees = new ArrayList<Employee>();
    Scanner sc = new Scanner(System.in);
    public  EmployeeService(){
        employees.add(new Employee(1,"Nguyen Van A","1/1/2004","0929557336","dev",20));
        employees.add(new Employee(2,"Nguyen Van B","1/2/2004","0929557337","dev",20));
        employees.add(new Employee(3,"Nguyen Van C","1/3/2004","0929557338","dev",20));
    }
    @Override
    public void getAll() {
        for(Employee i : employees){
            System.out.println(i.toString());
        }
    }

    @Override
    public Employee findById(long id) {
        for (Employee employee : employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    @Override
    public void add() {
        System.out.println("Moi nhap id nhan vien");
        long id = sc.nextLong();
        System.out.println("Moi nhap ten nhan vien");
        String name= sc.next();
        System.out.println("Moi nhap ngay sinh");
        String DOB = sc.next();
        System.out.println("Moi nhap so dien thoai");
        String PhoneNumber= sc.next();
        System.out.println("Moi nhap chưc vu");
        String WorkAs = sc.next();
        System.out.println("Moi nhap tuoi");
        int Age = sc.nextInt();
        Employee employee = new Employee(id,name,DOB,PhoneNumber,WorkAs, Age);
        employees.add(employee);
        getAll();
    }

    @Override
    public void updateById() {
        long id = sc.nextLong();
        Employee employee = findById(id);
        System.out.println("Moi nhap ten nhan vien");
        String name= sc.next();
        employee.setName(name);
        System.out.println("Moi nhap ngay sinh");
        String DOB = sc.next();
        employee.setDOB(DOB);
        System.out.println("Moi nhap so dien thoai");
        String PhoneNumber= sc.next();
        employee.setPhoneNumber(PhoneNumber);
        System.out.println("Moi nhap chưc vu");
        String WorkAs = sc.next();
        employee.setWorkAs(WorkAs);
        System.out.println("Moi nhap tuoi");
        int Age = sc.nextInt();
        employee.setAge(Age);
        getAll();
    }

    @Override
    public void deleteById() {
        DepartmentService departmentService = new DepartmentService();
        long id = sc.nextLong();
        employees.remove(findById(id));
        departmentService.removeEmployee(id);
        getAll();
    }

    public List<Employee> getEmployees(){
        return employees;
    }

}
