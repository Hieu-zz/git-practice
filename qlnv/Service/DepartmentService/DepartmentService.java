package qlnv.Service.DepartmentService;

import qlnv.Model.Department;
import qlnv.Model.Employee;
import qlnv.Service.EmployeeService.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService implements IDepartmentService{
    List<Department> departments = new ArrayList<Department>();
    EmployeeService employeeService = new EmployeeService();
    Scanner sc = new Scanner(System.in);
    public DepartmentService (){
        departments.add(new Department("A", 1));
        departments.add(new Department("B", 2));
        departments.add(new Department("C", 3,new Employee(3,"Nguyen Van C","1/3/2004","0929557338","dev",20)));
    }
    @Override
    public void getAll() {
        for (Department department: departments ){
            System.out.println(department.toString());
        }
    }

    @Override
    public Department findByName(String name) {
        for (Department department : departments){
            if (department.getName().equals(name))
                return  department;
        }
        return null;
    }

    @Override
    public void add() {
        System.out.println("danh sach nhan vien chua co phong");
        checkEmployee();
        System.out.println("Moi nhap ten phong");
        String name = sc.nextLine();
        System.out.println("Moi nhap so tang");
        int floor = sc.nextInt();
        System.out.println("Moi nhap id nhan vien");
        long id = sc.nextLong();
        Employee employee = employeeService.findById(id);
        Department department = new Department(name, floor, employee);
        departments.add(department);
        getAll();
    }

    @Override
    public void updateByName() {
        String name = sc.nextLine();
        Department department = findByName(name);
        System.out.println("Moi nhap ten phong");
        department.setName(sc.nextLine());
        System.out.println("Moi nhap tang");
        department.setFloor(sc.nextInt());
        getAll();
    }

    @Override
    public void deleteByName() {
        String name = sc.nextLine();
        departments.remove(findByName(name));
        getAll();
    }

    public void emptyDepartment(){
        List<Department> emptyDepartment = new ArrayList<>();
        for (Department department: departments){
            if (department.getEmployee() == null){
                emptyDepartment.add(department);
            }
        }
        for (Department department : emptyDepartment){
            System.out.println(department.toString());
        }

    }

    public void checkDepartment(){
        List<Department> checkDepartment = new ArrayList<>();
        for (Department department: departments){
            if (department.getEmployee() != null){
                checkDepartment.add(department);
            }
        }

        for (Department department: checkDepartment){
            System.out.println(department.toString());
        }
    }

    public void removeEmployee(long id){
        for (Department department: departments){
            if (department.getEmployee() != null){
                if (department.getEmployee().getId() == id){
                    department.setEmployee(null);
                }
            }
        }
        getAll();
    }

    public void checkEmployee(){
        List<Employee> employees = new ArrayList<>();
        List<Employee> checkEmployee = new ArrayList<>();

        for (Department department:departments){
            if (department.getEmployee() != null){
                employees.add(department.getEmployee());
            }
        }

        for (Employee i: employeeService.getEmployees()){
            for (Employee j : employees){
                if (i.getId() != j.getId()){
                    checkEmployee.add(i);
                }
            }
        }
        for (Employee employee : checkEmployee){
            System.out.println(employee.toString());

        }
    }
}
