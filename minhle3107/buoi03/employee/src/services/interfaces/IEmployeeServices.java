package services.interfaces;

import models.Employee;

import java.util.List;

public interface IEmployeeServices {
    Employee getById(long id);

    List<Employee> getAllEmployee();

    void create(Employee employee);

    void update(long id, Employee employee);

    void remove(long id);
}
