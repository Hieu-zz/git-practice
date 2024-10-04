package org.example.quanlynhanvien.services;

import org.example.quanlynhanvien.models.Employee;
import org.example.quanlynhanvien.models.Room;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployee();
    void addEmployee();
    void updateEmployee();
    void deleteEmployee();
    Employee getById(int id);
    void getEmployeeNoRoom();
}
