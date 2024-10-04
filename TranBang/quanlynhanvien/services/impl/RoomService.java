package org.example.quanlynhanvien.services.impl;

import org.example.quanlynhanvien.models.Employee;
import org.example.quanlynhanvien.models.Room;
import org.example.quanlynhanvien.services.IRoomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {

    static List<Room> rooms = new ArrayList<>();
    static List<Employee> employees = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    EmployeeService _employeeService;

    public RoomService(EmployeeService employeeService){
        this._employeeService=employeeService;
    }
    @Override
    public List<Room> viewAllRoom() {
        if (rooms.isEmpty()) {
            System.out.println("khong co phong");
        } else {
            for (Room room : rooms) {
                System.out.println(room);
            }
        }
        return null;
    }

    @Override
    public void addRoom() {
        System.out.println("Them phòng");
        System.out.print("Ten phòng: ");
        String name = sc.nextLine();
        System.out.print("Tang: ");
        int floor = sc.nextInt();
        sc.nextLine();
        Room room = new Room(name, floor);
        rooms.add(room);
        System.out.println("Phong da duoc them thanh cong!");
    }

    @Override
    public void updateRoom() {

    }

    @Override
    public void deleteRoom() {
        System.out.println("ten phong can xoa");
        String name = sc.nextLine();
        Room r = getByName(name);
        if(r!=null){
            employees.remove(r);
            System.out.println("da xoa thanh cong");
        }else{
            System.out.println("kh tim thay thong tin cua phong can xoa");
        }
    }

    @Override
    public Room getByName(String name) {
        for (Room room : rooms) {
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }

    @Override
    public void addEmployeeToRoom(long eId, String roomName) {
        Employee employee = _employeeService.getById((int) eId);
        Room room = getByName(roomName);
        if (employee == null) {
            System.out.println("Không tìm thấy nhân viên");
            return;
        }
        if (room == null) {
            System.out.println("Không tìm thấy phòng");
            return;
        }
        if (room.getEmployee() != null) {
            System.out.println("Phòng này đã có nhân viên");
        }
        room.setEmployee(employee);
        System.out.println("da them thanh cong");
    }


    @Override
    public void deleteEmployeeFromRoom(long eId, String roomName) {
        Employee employee = _employeeService.getById((int) eId);
        Room room = getByName(roomName);
        if (room == null) {
            System.out.println("Không tìm thấy phòng");
            return;
        }
        if (room.getEmployee().geteId() == employee.geteId()) {
            room.setEmployee(null);
            System.out.println("Nhân viên đã được xóa ra khỏi phòng");
        } else {
            System.out.println("Nhân viên này không có trong phòng ");
        }

    }
    @Override
    public List<Room> getRoomsEmployee() {
        List<Room> roomList = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getEmployee() != null) {
                roomList.add(room);
            }
        }
        System.out.println("Danh sách phòng đã có nhân viên:");
        for (Room room : roomList) {
            System.out.println(room.getName() + "," + room.getEmployee().getName());
        }
        return roomList;
    }



    @Override
    public List<Employee> getEmployeeByRoom() {
        List<Employee> employeesRoom = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getEmployee() != null) {
                employeesRoom.add(room.getEmployee());
            }
        }
        return employeesRoom;
    }


    @Override
    public List<Room> getEmptyRoom() {
        List<Room> emptyRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getEmployee() == null) {
                emptyRooms.add(room);
            }
        }
        if (emptyRooms.isEmpty()) {
            System.out.println("Không có phòng trống");
        } else {
            System.out.println("Danh sách phòng trống:");
            for (Room room : emptyRooms) {
                System.out.println(room);
            }
        }
        return emptyRooms;
    }


}
