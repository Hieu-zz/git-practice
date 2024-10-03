package Controller;

import Model.Employee;
import Model.Phong;
import com.sun.nio.sctp.NotificationHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhongManagement {
    public List<Phong> listPhong;


    Scanner sc = new Scanner(System.in);

    public PhongManagement() {
        listPhong = new ArrayList<>();
    }

    public void them(EmployeeManagement e) {
        System.out.println("Nhập tên phòng: ");
        String name = sc.next();
        System.out.println("Nhập tầng: ");
        int floor = sc.nextInt();
        Phong p = new Phong(name, floor);
        listPhong.add(p);

        System.out.println("Bạn có muốn thêm nhân viên ko?(1/2)");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                ganPhong(p, e);
                break;
            case 2:
                break;
        }
        System.out.println("Thêm phòng thành công");
    }

    public void suaP(String name) {
        boolean check = false;
        for (int i = 0; i < listPhong.size(); i++) {
            if (listPhong.get(i).getName().contentEquals(name)) {
                check = true;
                listPhong.get(i).setName(sc.next());
                listPhong.get(i).setFloor(sc.nextInt());
            }
        }
        if (!check) {
            System.out.println("Ko tồn tại phòng có tên trên!");
        }
    }

    public void xoaP(String name) {
        for (Phong p : listPhong) {
            if (p.getName().contentEquals(name)) {
                listPhong.remove(p);
            }
        }
    }


    public void hienThiDSP() {
        int i = 1;
        for (Phong p : listPhong) {
            if (p.getEmployee() != null) {
                System.out.println("Thông tin nhân viên đã có phòng ");
                System.out.print("Name: " + p.getName());
                System.out.print("\t\tFloor: " + p.getFloor());
                Employee e = p.getEmployee();
                System.out.print("\t\tID:" + e.getId());
                System.out.print("\t\tName:" + e.getName());
                System.out.print("\t\tAge:" + e.getAge());
                System.out.print("\t\tDOB:" + e.getDOB());
                System.out.print("\t\tPhone:" + e.getPhoneNumber());
                System.out.print("\t\tWorkAs: " + e.getWorkAs()+"\n");
                System.out.println("----------------------");
            }
        }
    }

    //Gán nhân viên
    public void ganPhong(Phong p, EmployeeManagement e) {
        //gán ds chưa có phòng vào list
        List<Employee> employeeList = e.employeeNoHasRoom();
        if (employeeList.isEmpty()) {
            System.out.println("Không có nhân viên chưa có phòng");
        }

        //DS chưa có phòng
        System.out.println("DS nhân viên chưa có phòng");
        for (Employee e1 : employeeList) {
            System.out.println("ID: " + e1.getId() + " Name: " + e1.getName());
        }
        //Chọn nhân viên theo ID để đưa vào phòng
        System.out.println("Nhập ID nhân viên muốn add vào phòng: ");
        int opt = sc.nextInt();

        //Tìm nhân viên theo ID
        Employee findEmployee = e.timEmId(opt);

        //check xem tồn tại và chưa có phòng => gán
        if (findEmployee != null && !findEmployee.isHasRoom()) {
            p.setEmployee(findEmployee); //gán vào phòng
            findEmployee.setHasRoom(true); // set lại trạng thái có phòng
        } else {
            System.out.println("Không tồn tại nhân viên trong danh sách");
        }
    }

    public void hienThiPhongTrong() {
        if (listPhong.isEmpty()) {
            System.out.println("Không có danh sách phòng");
        }
        for (Phong p : listPhong) {
            if (p.getEmployee() == null) {
                System.out.println("Thông tin phòng trống ");
                System.out.print("Name: " + p.getName());
                System.out.print("; Floor: " + p.getFloor()+"\n");
            }
        }
    }

    public void xoaNV(long id1){
        for (Phong p : listPhong){
            if(p.getEmployee() != null){
                if(p.getEmployee().getId() == id1){
                    p.setEmployee(null);
                }
            }
        }
    }

}
