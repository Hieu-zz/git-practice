package services;

import exceptions.InvalidIdException;
import models.Employee;
import services.interfaces.IEmployeeServices;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices implements IEmployeeServices {

    List<Employee> listEmployee = new ArrayList<>();

    public EmployeeServices() {
    }

    @Override
    public Employee getById(long id) {
        for (Employee employee : listEmployee) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void create(Employee employee) throws InvalidIdException {
        Employee check = getById(employee.getId());

        if (check != null) {
            throw new InvalidIdException("Id " + employee.getId() + " đã tồn tại");
        } else {
            listEmployee.add(employee);
            System.out.println("Successfully created new employee");
        }


    }

    @Override
    public void update(long id, Employee employee) {
        Employee employeeEdit = getById(id);

        if (employeeEdit == null) {
            System.out.println("Employee not found");
            return;
        }

        employeeEdit.setName(employee.getName());
        employeeEdit.setWorkAs(employee.getWorkAs());
        employeeEdit.setPhoneNumber(employee.getPhoneNumber());
        employeeEdit.setDOB(employee.getDOB());
        employeeEdit.setAge(employee.getAge());
        System.out.println("Updated employee successfully");
    }

    @Override
    public void remove(long id) {
        Employee employeeRemove = getById(id);

        if (employeeRemove == null) {
            System.out.println("Employee not found");
            return;
        }

        listEmployee.remove(employeeRemove);
        System.out.println("Delete employee successfully");

    }

    @Override
    public List<Employee> getAllEmployee() {
        return listEmployee;
    }
}
