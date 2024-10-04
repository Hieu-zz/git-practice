package org.example.quanlynhanvien.services.impl;

import org.example.quanlynhanvien.models.Employee;
import org.example.quanlynhanvien.models.Room;
import org.example.quanlynhanvien.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.quanlynhanvien.services.impl.RoomService.rooms;

public class EmployeeService implements IEmployeeService {

    static List<Employee> employees = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    @Override
    public List<Employee> getAllEmployee() {
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên");
            return new ArrayList<>();
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
        return employees;
    }

    @Override
    public void addEmployee() {
        System.out.println("Nhap id nhan vien:");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhap ten nhan vien");
        String name = sc.nextLine();
        System.out.println("Ngay sinh nhan vien");
        String dob = sc.nextLine();
        System.out.println("Tuoi cua nhan vien");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("so dien thoai cua nhan vien");
        String phone = sc.nextLine();
        System.out.println("workAs cua nhan vien");
        String workAs = sc.nextLine();


        Employee e = new Employee(id,name,dob,age,phone,workAs);
        employees.add(e);
        System.out.println("them nhan vien thanh cong");
    }

    @Override
    public void updateEmployee() {
        System.out.println("id nhan vien can cap nhat");
        int id = sc.nextInt();
        sc.nextLine();
        Employee e = getById(id);
        if(e!=null){
            System.out.println("New Name:");
            String name = sc.nextLine();
            e.setName(name);
            System.out.println("new dob");
            String dob = sc.nextLine();
            e.setDob(dob);
            System.out.println("new phone ");
            String phone = sc.nextLine();
            e.setPhone(phone);
            System.out.println("new workAs ");
            String workAs = sc.nextLine();
            e.setWorkAs(workAs);
            System.out.println("New Age:");
            int age = sc.nextInt();
            e.setAge(age);

            System.out.println("Cap nhat thanh cong");
        }else {
            System.out.println("Khong tim thay thong tin cua nhan vien can sua doi");
        }
    }

    @Override
    public void deleteEmployee() {
        System.out.println("id nhan vien can xoa");
        int id = sc.nextInt();
        sc.nextLine();
        Employee e = getById(id);
        if(e!=null){
            for (Room room : rooms) {
                if (room.getEmployee().geteId() == e.geteId()) {
                    room.setEmployee(null);
                    break;
                }
            }
            employees.remove(e);
            System.out.println("da xoa thong tin cua nhan vien");
        }else{
            System.out.println("kh tim thay thong tin cua nhan vien can xoa");
        }
    }

    @Override
    public Employee getById(int id) {
        for(Employee e:employees){
            if(e.geteId()==id){
                return e;
            }
        }
        return null;
    }

    @Override
    public void getEmployeeNoRoom() {
        List<Employee> employeeNoRoom = new ArrayList<>();

        List<Long> employeeByRoom = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getEmployee() != null) {
                employeeByRoom.add(room.getEmployee().geteId());
            }
        }
        for (Employee employee : employees) {
            if (!employeeByRoom.contains(employee.geteId())) {
                employeeNoRoom.add(employee);
            }
        }
        if (employeeNoRoom.isEmpty()) {
            System.out.println("Tất cả nhân viên đều có phòng");
        } else {
            System.out.println("Nhân viên không có phòng:");
            for (Employee emp : employeeNoRoom) {
                System.out.println(emp);
            }
        }

    }
}

