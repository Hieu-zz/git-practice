package qlnv.Service.EmployeeService;

import qlnv.Model.Employee;

public interface IEmployeeService {
    void getAll();
    Employee findById(long id);
    void add();
    void updateById();
    void deleteById();

}
