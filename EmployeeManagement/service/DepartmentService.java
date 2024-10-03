package EmployeeManagement.service;

import java.util.*;

import EmployeeManagement.model.Department;
import EmployeeManagement.model.Employee;

public class DepartmentService {
    public List<Department> departments = new ArrayList<>();
    EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void displayDepartments() {
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (departments.size() > 1) {
            for (Department department : departments) {
                System.out.println(department);
            }
        } else {
            System.out.println("There's no department");
        }
    }

    public void displayEmptyDepartments() {
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (departments.size() > 1) {
            for (Department department : departments) {
                if (department.getEmployee() == null) {
                    System.out.println(department);
                }
            }
        } else {
            System.out.println("There's no department");
        }
    }

    public void displayOccupiedDepartments() {
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (departments.size() > 1) {
            for (Department department : departments) {
                if (department.getEmployee() != null) {
                    System.out.println(department);
                }
            }
        } else {
            System.out.println("There's no department");
        }
    }

    Department getDepartmentByName(String name) {
        return departments.stream()
                .filter(department -> department.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void removeEmployee() {
        for (Department department : departments) {
            if (department.getEmployee() != null) {
                if (employeeService.getEmployeeByID(department.getEmployee().getId()) == null) {
                    department.setEmployee(null);
                    department.setHasEmployee(false);
                }
            }
        }
    }

    public void addDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter department name: ");
        String name = input.nextLine();
        System.out.print("Enter the floor: ");
        int floor = input.nextInt();
        input.nextLine();
        Employee employee;
        boolean hasEmployee;
        if (employeeService.getEmployeesWithoutDepartment().size() > 0) {
            System.out.println("Choose an employee below for this department: ");
            for (Employee _employee : employeeService.getEmployeesWithoutDepartment()) {
                System.out.println(_employee);
            }
            long id;
            System.out.print("Enter the ID: ");
            do {
                id = input.nextInt();
                input.nextLine();
                if (!employeeService.isDuplicated(id)) {
                    System.out.print("This id doesn't exist\nTry another ID: ");
                }
            } while (!employeeService.isDuplicated(id));
            employee = employeeService.getEmployeeByID(id);
            employee.setInDepartment(true);
            hasEmployee = true;
        } else {
            employee = null;
            hasEmployee = false;
        }
        departments.add(new Department(name, floor, hasEmployee, employee));
        input.close();
    }

    public void editDepartment() {

    }

    public void removeDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter department name: ");
        String name = input.nextLine();
        Department department = getDepartmentByName(name);
        Employee employee = employeeService.getEmployeeByID(department.getEmployee().getId());
        employee.setInDepartment(false);
        departments.remove(department);
        input.close();
    }
}
