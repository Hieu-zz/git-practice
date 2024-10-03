package qlnv.Service.DepartmentService;

import qlnv.Model.Department;

public interface IDepartmentService {
    void getAll();
    Department findByName(String name);
    void add();
    void updateByName();
    void deleteByName();

}
