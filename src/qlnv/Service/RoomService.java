package qlnv.Service;

import qlnv.Modal.Employee;
import qlnv.Modal.Room;
import qlnv.Service.IEmployeeService.IRoomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {
    private EmployeeService employeeService;
    private List<Room> listR = new ArrayList<>();
    private List<Employee> listE = new ArrayList<>();

    public RoomService() {
        this.employeeService = new EmployeeService();
    }

    public List<Employee> employees() {
        return employeeService.list;
    }

    public List<Employee> NV() {
        for (Room r : listR) {
            if (r.getFloor() == 1) {
                listE.add(r.getEmployee());
            }
        }

        for (Employee a : listE) {
            employees().removeIf(e -> e.equals(a));
        }

        return employees();
    }

    @Override
    public List<Room> getAll() {
        Employee employee = new Employee(1L, "Tuan", 20, "22/2/2003", "03599", "nhan vien");
        Room room = new Room(1, "Tang CY", 1, employee);
        listR.add(room);
        return listR;
    }

    @Override
    public List<Room> add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập id phòng:");
        int id = scanner.nextInt();

        System.out.println("Nhập tên phòng:");
        String name = scanner.next();

        System.out.println("Nhập tầng:");
        int floor = scanner.nextInt();

        Room room = new Room(id, name, floor, null); // No employee assigned yet
        listR.add(room);

        return listR;
    }
    public void showAllroomandNameNoNull(){

        for (Room r : listR) {
            if(r.getEmployee()==null){
                System.out.println("not thing");
            }else {
                System.out.println(r);
                System.out.println(r.getEmployee().getName());
            }

        }

    }
    public void deleteEmloy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id nv muốn xóa");
        int id = scanner.nextInt();
        for ( Room r : listR) {
            if(r.getEmployee() != null && r.getEmployee().getId()==id ){
                r.setEmployee(null);
                break;
            }

        }

    }

    @Override
    public List<Room> empty(){
        List<Room> roomList = new ArrayList<>();
        for (Room r  : listR ) {
            if(r.getEmployee()==null){
                System.out.println(r);
                roomList.add(r);
            }

        }
        return roomList;
    }

    public void addEmployeeToRoom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Các phòng hiện tại:");
        for (Room room : listR) {
            System.out.println( room);
        }

        System.out.println("Nhập ID phòng để thêm nhân viên:");
        int roomId = scanner.nextInt();

        Room selectedRoom = null;
        for (Room room : listR) {
            if (room.getId() == roomId) {
                selectedRoom = room;
                break;
            }
        }

        if (selectedRoom == null) {
            System.out.println("Phòng không tồn tại!");
            return;
        }

        List<Employee> availableEmployees = employees();
        System.out.println("Nhân viên có sẵn:");
        for (Employee employee : availableEmployees) {
            System.out.println(employee);
        }

        System.out.println("Nhập ID nhân viên để thêm vào phòng:");
        int employeeId = scanner.nextInt();

        Employee selectedEmployee = null;
        for (Employee employee : availableEmployees) {
            if (employee.getId() == employeeId) {
                selectedEmployee = employee;
                break;
            }
        }

        if (selectedEmployee != null) {
            selectedRoom.setEmployee(selectedEmployee);
            listE.add(selectedEmployee);
            System.out.println("Nhân viên đã được thêm vào phòng.");
        } else {
            System.out.println("Nhân viên không tồn tại hoặc đã được thêm vào phòng.");
        }
    }


    @Override
    public void delete(long id) {
        // Not implemented yet
    }
}
