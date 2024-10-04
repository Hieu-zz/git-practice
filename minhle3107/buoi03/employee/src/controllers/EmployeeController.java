package controllers;

import exceptions.InvalidIdException;
import models.Employee;
import services.EmployeeServices;

import java.util.List;

public class EmployeeController {

    protected EmployeeServices employeeServices;

    public EmployeeController() {
    }

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    public List<Employee> getAll() {
        return employeeServices.getAllEmployee();
    }

    public void create(Employee employee) throws InvalidIdException {
        employeeServices.create(employee);
    }

    public Employee getById(long id) {
        return employeeServices.getById(id);
    }


    public void edit(long id, Employee employee) {
        employeeServices.update(id, employee);
    }

    public void remove(long id) {
        employeeServices.remove(id);
    }

}
