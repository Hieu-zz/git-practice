package ex1.service.impl;

import ex1.model.Employee;
import ex1.service.IEmployeeService;
import ex1.service.IRoomService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImplement implements IEmployeeService {
    public List<Employee> employeeList=new ArrayList<>();
    @Override
    public List<Employee> getAll() {
        return this.employeeList;
    }

    @Override
    public void insert(Employee employee) {
        this.employeeList.add(employee);
    }

    @Override
    public void delete(long id, IRoomService roomService) {
        this.employeeList.remove(this.employeeList.stream().filter(x->x.getId()==id).toList().get(0));
        roomService.getAll().stream().filter(x->x.getEmployee().getId()==id).toList().get(0).setEmployee(null);
    }

    @Override
    public void update(Employee employee) {
        Employee sltEmployee=this.employeeList.stream().filter(x->x.getId()== employee.getId()).toList().get(0);
        sltEmployee.setName(employee.getName());
        sltEmployee.setDob(employee.getDob());
        sltEmployee.setAge(employee.getAge());
        sltEmployee.setWorkAs(employee.getWorkAs());
        sltEmployee.setPhoneNumber(employee.getPhoneNumber());
    }


    @Override
    public Employee findById(long id) {
        return this.employeeList.stream().filter(x->x.getId()== id).toList().get(0);
    }


    @Override
    public void phanCong(long eid,long rid) {
        this.employeeList.stream().filter(x->x.getId()==eid).toList().get(0).setRoomId(rid);

    }

    @Override
    public List<Employee> getEmployeeAvai() {
        List<Employee>employees=this.employeeList;
        List<Employee>avaiEmployess=new ArrayList<>();
        for(Employee e:employees){
            if(e.getRoomId()==0L){
                avaiEmployess.add(e);
            }
        }
        return avaiEmployess;
    }

}
