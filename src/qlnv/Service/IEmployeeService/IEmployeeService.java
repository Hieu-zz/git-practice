package qlnv.Service.IEmployeeService;

import qlnv.Modal.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
    List<Employee> add();
    List<Employee> fix(long id);
    void delete(long id);
}
