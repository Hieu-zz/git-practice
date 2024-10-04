package services.interfaces;

import exceptions.InvalidIdException;
import models.Employee;

import java.util.List;

public interface IEmployeeServices {
    Employee getById(long id);

    List<Employee> getAllEmployee();

    void create(Employee employee) throws InvalidIdException;

    void update(long id, Employee employee);

    void remove(long id);
}
