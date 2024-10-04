package org.example.quanlynhanvien.controller;

import org.example.StudentManager;
import org.example.quanlynhanvien.models.Room;
import org.example.quanlynhanvien.services.IEmployeeService;
import org.example.quanlynhanvien.services.impl.EmployeeService;
import org.example.quanlynhanvien.services.impl.RoomService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        EmployeeService e = new EmployeeService();
        RoomService r = new RoomService(e);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Employee Management");
            System.out.println("1. Xem tất cả nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Cập nhật nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Xem phòng");
            System.out.println("6. Them phòng");
            System.out.println("7. Danh sách nhân viên chưa có phòng");
            System.out.println("8. Danh sách phòng trống");
            System.out.println("9. Danh sách phòng đã có người");
            System.out.println("10. Thêm nhân viên vào phòng");
            System.out.println("11. Xoa nhan vien ra khoir phong");
            System.out.print("Choose an option: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    e.getAllEmployee();
                    break;
                case 2:
                    e.addEmployee();
                    break;
                case 3:
                    e.updateEmployee();
                    break;
                case 4:
                    e.deleteEmployee();
                    break;
                case 5:
                    r.viewAllRoom();
                    break;
                case 6:
                    r.addRoom();
                    break;
                case 7:
                    e.getEmployeeNoRoom();
                    break;
                case 8:
                    r.getEmptyRoom();
                    break;
                case 9:
                    r.getRoomsEmployee();
                    break;
                case 10:
                    System.out.print("ID nhân viên: ");
                    long eId = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Tên phòng: ");
                    String roomName = sc.nextLine();
                    r.addEmployeeToRoom(eId, roomName);
                    break;
                case 11:
                    System.out.print("ID nhân viên: ");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Tên phòng: ");
                    String name = sc.nextLine();
                    r.deleteEmployeeFromRoom(id,name);
                    break;
                default:
                    System.out.println("re-enter");
            }
        }

    }
}
