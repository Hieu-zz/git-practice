package qlnv.Controller;

import qlnv.Modal.Employee;
import qlnv.Modal.Room;
import qlnv.Service.EmployeeService;
import qlnv.Service.RoomService;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Scanner;

public class RoomController {
    public String main_menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn một trong các tùy chọn:");
        System.out.println("a. nhân viên trống ");
        System.out.println("b. thêm phòng ");
        System.out.println("c. lấy room ");
        System.out.println("d. thêm nv vào room");
        System.out.println("e. Show phòng trống");
        System.out.println("f. Show phòng có người");
        System.out.println("g. Show phòng có người");
        System.out.println("h. Thoát");
        System.out.println("chọn chức năng sử dụng");
        String select = scanner.next();
        return select;
    }
    public void clear(RoomService roomService){
        List<Employee> a = roomService.NV();
        for ( Employee ab : a
             ) {
            System.out.println(ab.toString());
        }

    }
    public void addEmploy(RoomService roomService){
        roomService.add();
    }
    public void getAll(RoomService roomService){
        List<Room> roomList= roomService.getAll();
        for (Room r: roomList
             ) {
            System.out.println(r);
        }
    }
    public void addNvinRoom(RoomService roomService ){
            roomService.addEmployeeToRoom();
    }
    public void showallEmptyRoom(RoomService roomService){
        roomService.empty();
    }
    public void show(RoomService roomService){
        roomService.showAllroomandNameNoNull();
    }
    public void delete(RoomService roomService){
        roomService.deleteEmloy();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RoomController main = new RoomController();
        RoomService roomService = new RoomService();

        boolean check = true;
        while (check) {
            System.out.println("nhap lua chon");
            String select = main.main_menu();
            switch (select) {
                case "a":
                    main.clear(roomService);
                    break;
                case "b":

                    main.addEmploy(roomService);
                    break;
                case "c":
                    main.getAll(roomService);

                    break;
                case "d":

                    main.addNvinRoom(roomService);
                    break;
                case "e":

                    main.showallEmptyRoom(roomService);
                    break;
                case "f":

                    main.show(roomService);
                    break;
                case "g":

                    main.delete(roomService);
                    break;
                case "h":
                    check = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        }
    }

}
