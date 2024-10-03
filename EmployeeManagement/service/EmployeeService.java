package EmployeeManagement.service;

import java.util.*;

import EmployeeManagement.model.Employee;

public class EmployeeService {
    public List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        this.employees.add(new Employee(1, "emp1", 18, "12/12/1999", "0123456789", "emp1", false));
        this.employees.add(new Employee(2, "emp2", 19, "11/11/1999", "0123456799", "emp2", false));
        this.employees.add(new Employee(3, "emp3", 20, "10/10/1999", "0123456789", "emp3", false));
    }

    public void displayEmployees() {
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (employees.size() > 1) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } else {
            System.out.println("There's no employee");
        }
    }

    public List<Employee> getEmployeesWithoutDepartment() {
        List<Employee> list = new ArrayList<>();
        if (employees != null) {
            for (Employee employee : employees) {
                if (!employee.isInDepartment()) {
                    list.add(employee);
                }
            }
        }
        return list;
    }

    Employee getEmployeeByID(long id) {
        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst().orElse(null);
    }

    boolean isDuplicated(long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void addEmployee() {
        int id;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        do {
            id = input.nextInt();
            input.nextLine();
            if (isDuplicated(id)) {
                System.out.print("This ID is existing\nTry another ID: ");
            }
        } while (isDuplicated(id));
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter date of birth: ");
        String DOB = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Work as: ");
        String workAs = input.nextLine();
        employees.add(new Employee(id, name, age, DOB, phoneNumber, workAs, false));
        input.close();
    }

    public void editEmployee() {
        Scanner input = new Scanner(System.in);
        int id;
        System.out.print("Enter employee ID: ");
        do {
            id = input.nextInt();
            input.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));

        Employee employee = getEmployeeByID(id);

        System.out.print("Enter name: ");
        employee.setName(input.nextLine());
        System.out.print("Enter age: ");
        employee.setAge(input.nextInt());
        input.nextLine();
        System.out.print("Enter date of birth: ");
        employee.setDOB(input.nextLine());
        System.out.print("Enter phone number: ");
        employee.setPhoneNumber(input.nextLine());
        System.out.print("Work as: ");
        employee.setWorkAs(input.nextLine());
        input.close();
    }

    public void removeEmployee() {
        Scanner input = new Scanner(System.in);
        int id;
        System.out.print("Enter employee ID: ");
        do {
            id = input.nextInt();
            input.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        employees.remove(getEmployeeByID(id));
        System.out.println("This employee has been fired");
        input.close();
    }
}
