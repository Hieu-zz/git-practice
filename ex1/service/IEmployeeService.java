package ex1.service;

import ex1.model.Employee;

import java.util.List;

public interface IEmployeeService{
    List<Employee> getAll();
    void insert(Employee employee);
    void delete(long id, IRoomService roomService);
    void update(Employee employee);
    Employee findById(long id);
    void phanCong(long eid,long rid);
    List<Employee>getEmployeeAvai();
}
