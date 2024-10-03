package ex1.controller;

import ex1.model.Employee;
import ex1.model.Room;
import ex1.service.IEmployeeService;
import ex1.service.IRoomService;
import ex1.service.impl.EmployeeServiceImplement;
import ex1.service.impl.RoomServiceImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static IEmployeeService employeeService = new EmployeeServiceImplement();
    static IRoomService roomService = new RoomServiceImplement();

    public static Room inputRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên phòng:");
        String name = sc.nextLine();
        System.out.println("Nhập tầng:");
        int floor = sc.nextInt();
        sc.nextLine();
//        System.out.println("Bạn có muốn điều người hay không: 1.có 2.không");
//        int check = sc.nextInt();
//        sc.nextLine();
//        int eid = 0;
//        if (check == 1) {
//            for (Employee e : employeeService.findEmployeeAvailable()) {
//                System.out.println("Nhân viên: Id: " + e.getId()
//                        + " Tên: " + e.getName()
//                        + " Tuổi: " + e.getAge()
//                        + " Ngày sinh: " + e.getDob()
//                        + " Số điện thoại: " + e.getPhoneNumber()
//                        + " Chức vụ: " + e.getWorkAs());
//            }
//            System.out.println("Nhập vào id nhân viên :");
//            eid = sc.nextInt();
//            sc.nextLine();
//        }
        Room room;
        room = new Room(id, name, null, floor);
        return room;
    }

    public static Employee inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên nhân viên:");
        String name = sc.nextLine();
        System.out.println("Nhập vào tuổi nhân viên:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào ngày sinh:");
        String dob = sc.nextLine();
        System.out.println("Nhập vào số điện thoại:");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập vào vị trí:");
        String workAs = sc.nextLine();
        Employee employee = new Employee(id, name, age, dob, phoneNumber, workAs);
        return employee;
    }

    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn hành động");
        System.out.println("1.Nhân viên");
        System.out.println("2.Phòng");
        int sl = sc.nextInt();
        return sl;
    }

    static int menu1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Xem tất cả nhân viên");
        System.out.println("2.Xóa nhân viên");
        System.out.println("3.Thêm nhân viên");
        System.out.println("4.Sửa nhân viên");
        System.out.println("5.Hiển thị các nhân viên còn trống");
        System.out.println("6.Phân công");
        int sl = sc.nextInt();
        return sl;
    }

    static int menu2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Xem tất cả phòng");
        System.out.println("2.Xóa phòng");
        System.out.println("3.Thêm phòng");
        System.out.println("4.Sửa phòng");
        System.out.println("5.Xem danh sách phòng còn trống");
        int sl = sc.nextInt();
        return sl;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Duong1", 19, "26/12/2003", "0934274635", "Dev"));
        employeeList.add(new Employee(2, "Duong2", 19, "26/12/2003", "0934274635", "Dev"));
        employeeList.add(new Employee(3, "Duong3", 19, "26/12/2003", "0934274635", "Dev"));
        employeeList.add(new Employee(4, "Duong4", 19, "26/12/2003", "0934274635", "Dev"));
        employeeList.add(new Employee(5, "Duong5", 19, "26/12/2003", "0934274635", "Dev"));
        employeeList.add(new Employee(6, "Duong6", 19, "26/12/2003", "0934274635", "Dev"));
        for (Employee employee : employeeList) {
            employeeService.insert(employee);
        }
        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room(1, "Phòng kế toán", null, 3));
        roomList.add(new Room(2, "Phòng nhân sự", null, 3));
        roomList.add(new Room(3, "Phòng marketing", null, 3));
        roomList.add(new Room(4, "Phòng hop", null, 3));
        roomList.add(new Room(5, "Phòng giám đốc", null, 3));
        for (Room room:roomList){
            roomService.insert(room);
        }
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        boolean check1 = true;
        boolean check2 = true;
        while (check) {
            switch (menu()) {
                case 1:
                    while (check1) {
                        switch (menu1()) {
                            case 1:
                                for (Employee e : employeeService.getAll()) {
                                    System.out.println("Nhân viên: Id: " + e.getId()
                                            + " Tên: " + e.getName()
                                            + " Tuổi: " + e.getAge()
                                            + " Ngày sinh: " + e.getDob()
                                            + " Số điện thoại: " + e.getPhoneNumber()
                                            + " Chức vụ: " + e.getWorkAs());
                                }
                                break;
                            case 2:
                                System.out.println("Chọn id nhân viên muốn xóa:");
                                int select_id = sc.nextInt();
                                employeeService.delete(select_id,roomService);
                                break;
                            case 3:
                                employeeService.insert(inputEmployee());
                                break;
                            case 4:
                                employeeService.update(inputEmployee());
                                break;
                            case 5:
                                for (Employee e : employeeService.getEmployeeAvai()) {
                                    System.out.println("Nhân viên: Id: " + e.getId()
                                            + " Tên: " + e.getName()
                                            + " Tuổi: " + e.getAge()
                                            + " Ngày sinh: " + e.getDob()
                                            + " Số điện thoại: " + e.getPhoneNumber()
                                            + " Chức vụ: " + e.getWorkAs());
                                }
                                break;
                            case 6:
                                for (Employee e : employeeService.getEmployeeAvai()) {
                                    System.out.println("Nhân viên: Id: " + e.getId()
                                            + " Tên: " + e.getName()
                                            + " Tuổi: " + e.getAge()
                                            + " Ngày sinh: " + e.getDob()
                                            + " Số điện thoại: " + e.getPhoneNumber()
                                            + " Chức vụ: " + e.getWorkAs());
                                }
                                System.out.println("Chọn nhân viên:");
                                int eid = sc.nextInt();
                                for (Room r : roomService.getAllRoomAvai()) {
                                    System.out.println("Phòng: Id: " + r.getId() + " Tên phòng: " + r.getName() + " Tầng: " + r.getFloor());
                                    System.out.println("Phụ trách: Không có người phụ trách");
                                }
                                System.out.println("Chọn phòng:");
                                int rid = sc.nextInt();
                                employeeService.phanCong(eid, rid);
                                roomService.phancong(eid,rid,employeeService);
                                break;
                            default:
                                check1 = false;
                        }
                    }
                    check1=true;
                    break;
                case 2:
                    while (check2) {
                        switch (menu2()) {
                            case 1:
                                for (Room r : roomService.getAll()) {
                                    System.out.println("Phòng: Id: " + r.getId() + " Tên phòng: " + r.getName() + " Tầng: " + r.getFloor());
                                    if (r.getEmployee() != null) {
                                        System.out.println("Phụ trách: Id: " + r.getEmployee().getId() + " Tên: " + r.getEmployee().getName() + " Tuổi: " + r.getEmployee().getAge() + " Ngày sinh: " + r.getEmployee().getDob() + " Số điện thoại: " + r.getEmployee().getPhoneNumber() + " Chức vụ: " + r.getEmployee().getWorkAs());
                                    } else {
                                        System.out.println("Phụ trách: Không có người phụ trách");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Chọn id phòng muốn xóa:");
                                int select_id = sc.nextInt();
                                sc.nextLine();
                                roomService.delete(select_id);
                                break;
                            case 3:
                                roomService.insert(inputRoom());
                                break;
                            case 4:
                                roomService.update(inputRoom());
                                break;
                            case 5:
                                for (Room r : roomService.getAllRoomAvai()) {
                                    System.out.println("Phòng: Id: " + r.getId() + " Tên phòng: " + r.getName() + " Tầng: " + r.getFloor());
                                    System.out.println("Phụ trách: Không có người phụ trách");
                                }
                                break;
                            default:
                                check2 = false;

                        }
                    }
                    check2=true;
                    break;
                default:
                    check = false;
            }
        }
    }
}
