import controllers.EmployeeController;
import controllers.RoomController;
import models.Employee;
import models.Room;
import services.EmployeeServices;
import services.RoomServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeServices employeeServices = new EmployeeServices();
        RoomServices roomServices = new RoomServices();
        EmployeeController employeeController = new EmployeeController(employeeServices);
        RoomController roomController = new RoomController(roomServices, employeeServices);

        Scanner sc = new Scanner(System.in);

        int choose;

        do {
            System.out.println("***********MENU***********");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiện thị danh sách nhân viên");
            System.out.println("3. Sửa nhân viên theo id");
            System.out.println("4. Xóa nhân viên theo id");
            System.out.println("5. Thêm phòng");
            System.out.println("6. Hiện thị danh sách phòng");
            System.out.println("7. Sửa thông tin phòng theo id");
            System.out.println("8. Xóa phòng theo id");
            System.out.println("9. Danh sách nhân viên chưa có phòng");
            System.out.println("10. Hiện thị danh sách phòng còn trống");
            System.out.println("11. Hiển thị danh sách phòng đã có người và tên của người trong phòng");
            System.out.println("12. Đặt phòng");
            System.out.println("0. Thoát");
            System.out.println("***************************");
            System.out.print("Lựa chọn 1 trong các chức năng trên: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    createdEmployee(employeeController);

                    break;
                case 2:
                    getAllEmployee(employeeController);
                    break;

                case 3:
                    updatedEmployee(employeeController);
                    break;

                case 4:
                    deletedEmployee(employeeController, roomController);
                    break;

                case 5:
                    createdRoom(roomController);
                    break;

                case 6:
                    getAllRoom(roomController);
                    break;

                case 7:
                    updateRoom(roomController, employeeController);
                    break;
                case 8:
                    removeRoom(roomController);
                    break;
                case 9:
                    employeeDoesNotHaveARoomYet(roomController);
                    break;
                case 10:
                    showListOfAvailableRooms(roomController);
                    break;
                case 11:
                    showListOfOccupiedRoomsAndTheirNames(roomController);
                    break;
                case 12:
                    bookRoom(roomController, employeeController);
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Bạn đã chọn sai. Vui lòng nhập lại!");
            }

        } while (choose != 0);
    }


    public static void getAllEmployee(EmployeeController employeeController) {
        if (employeeController.getAll().isEmpty()) {
            System.out.println("Empty employee list");
        } else {
            employeeController.getAll().forEach(System.out::println);
        }
    }

    public static void createdEmployee(EmployeeController employeeController) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Id: ");
        employee.setId(sc.nextLong());

        inputEmployee(sc, employee);

        if (employeeController.getById(employee.getId()) != null) {
            System.out.println("Id already exists");
        } else {
            employeeController.create(employee);
        }
    }

    private static void inputEmployee(Scanner sc, Employee employee) {
        System.out.print("Name: ");
        employee.setName(sc.next());

        System.out.print("DOB: ");
        employee.setDOB(sc.next());

        System.out.print("Phone: ");
        employee.setPhoneNumber(sc.next());

        System.out.print("Work: ");
        employee.setWorkAs(sc.next());

        System.out.print("Age: ");
        employee.setAge(sc.nextInt());
    }

    public static void updatedEmployee(EmployeeController employeeController) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter employee id: ");
        long id = sc.nextLong();

        inputEmployee(sc, employee);

        employeeController.edit(id, employee);

    }

    public static void deletedEmployee(EmployeeController employeeController, RoomController roomController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        long id = sc.nextLong();
        employeeController.remove(id);
        roomController.updateRoomAfterDeletingEmployee(id);
    }


    public static void createdRoom(RoomController roomController) {
        Scanner sc = new Scanner(System.in);
        Room room = new Room();

        System.out.print("Id: ");
        room.setId(sc.nextLong());

        System.out.print("Name: ");
        room.setName(sc.next());

        System.out.print("Floor: ");
        room.setFloor(sc.nextInt());

        room.setEmployee(null);

        if (roomController.getById(room.getId()) != null) {
            System.out.println("Id already exists");
        } else {
            roomController.create(room);
        }
    }

    public static void getAllRoom(RoomController roomController) {
        if (roomController.getAll().isEmpty()) {
            System.out.println("Empty room list");
        } else {
            roomController.getAll().forEach(System.out::println);
        }
    }

    // Hiện thị danh sách phòng còn trống
    public static void showListOfAvailableRooms(RoomController roomController) {
        if (roomController.showListOfAvailableRooms().isEmpty()) {
            System.out.println("Empty room list");
        } else {
            roomController.showListOfAvailableRooms().forEach(System.out::println);
        }
    }

    // Hiển thị danh sách phòng đã có người và tên của người trong phòng
    public static void showListOfOccupiedRoomsAndTheirNames(RoomController roomController) {
        if (roomController.showListOfOccupiedRoomsAndTheirNames().isEmpty()) {
            System.out.println("Empty room list");
        } else {
            roomController.showListOfOccupiedRoomsAndTheirNames().forEach(System.out::println);
        }
    }

    // xoa phong
    public static void removeRoom(RoomController roomController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room id: ");
        long id = sc.nextLong();
        roomController.remove(id);
    }

    // Danh sách nhân viên chưa có phòng
    public static void employeeDoesNotHaveARoomYet(RoomController roomController) {
        if (roomController.employeeDoesNotHaveARoomYet().isEmpty()) {
            System.out.println("Empty room list");
        } else {
            roomController.employeeDoesNotHaveARoomYet().forEach(System.out::println);
        }
    }

    // cap nhat phong
    public static void updateRoom(RoomController roomController, EmployeeController employeeController) {
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        System.out.print("Enter room id: ");
        long id = sc.nextLong();

        System.out.print("Name: ");
        room.setName(sc.next());

        System.out.print("Floor: ");
        room.setFloor(sc.nextInt());

        System.out.print("Id employee: ");
        room.setEmployee(employeeController.getById(sc.nextLong()));
        roomController.updateRoom(id, room);
    }

    // book phòng
    public static void bookRoom(RoomController roomController, EmployeeController employeeController) {
        Scanner sc = new Scanner(System.in);

        Room room = new Room();

        System.out.println("Danh sách phòng trống: ");
        System.out.println("****************************************************");
        roomController.showListOfAvailableRooms().forEach(System.out::println);
        System.out.println("****************************************************");

        System.out.print("Chọn id phòng cần đặt: ");
        long idRoom = sc.nextLong();

        System.out.println("Danh sách nhân viên chưa có phòng: ");
        System.out.println("****************************************************");
        roomController.employeeDoesNotHaveARoomYet().forEach(System.out::println);
        System.out.println("****************************************************");

        System.out.print("Chọn id nhân viên: ");
        Employee employee = employeeController.getById(sc.nextLong());
        room.setEmployee(employee);

        roomController.bookRoom(idRoom, room);
    }
}