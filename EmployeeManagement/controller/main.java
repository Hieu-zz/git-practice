package EmployeeManagement.controller;

import java.util.Scanner;

import EmployeeManagement.service.*;

public class main {

    EmployeeService employeeService = new EmployeeService();
    DepartmentService departmentService = new DepartmentService(employeeService);

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = input.nextInt();
            handleMenuChoices(choice);
            if (choice == 0) {
                break;
            }
        }
        input.close();
    }

    public void showMenu() {
        System.out.println();
        System.out.print("1. Show all the employees\n"
                + "2. Add an employee\n"
                + "3. Edit an employee\n"
                + "4. Remove employee by ID\n"
                + "5. Show all the departments\n"
                + "6. Show the empty departments\n"
                + "7. Show the occupied departments\n"
                + "8. Add a departments\n"
                + "9. Edit a departments\n"
                + "10. Remove a departments\n"
                + "0. Exit\n"
                + "Your choice: ");
    }

    public void handleMenuChoices(int choice) {
        switch (choice) {
            case 1:
                employeeService.displayEmployees();
                break;
            case 2:
                employeeService.addEmployee();
                break;
            case 3:
                employeeService.editEmployee();
                break;
            case 4:
                employeeService.removeEmployee();
                departmentService.removeEmployee();
                break;
            case 5:
                departmentService.displayDepartments();
                break;
            case 6:
                departmentService.displayEmptyDepartments();
                break;
            case 7:
                departmentService.displayOccupiedDepartments();
                break;
            case 8:
                departmentService.addDepartment();
                break;
            case 9:
                departmentService.editDepartment();
                break;
            case 10:
                departmentService.removeDepartment();
                break;
            default:
                break;
        }
    }
}
