package services;

import models.Employee;
import models.Room;
import services.interfaces.IRoomServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoomServices implements IRoomServices {

    List<Room> listRoom = new ArrayList<>();

    public RoomServices() {

    }

    @Override
    public void create(Room room) {
        listRoom.add(room);

    }

    @Override
    public Room getById(long id) {
        for (Room room : listRoom) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAllRoom() {
        return listRoom;
    }

    // Hiển thị danh sách phòng trống
    @Override
    public List<Room> showListOfAvailableRooms() {
        ArrayList<Room> listOfAvailableRooms = new ArrayList<>();
        for (Room room : listRoom) {
            if (room.getEmployee() == null) {
                listOfAvailableRooms.add(room);
            }
        }

        return listOfAvailableRooms;
    }

    // danh sách phòng đã có người
    @Override
    public List<Room> showListOfOccupiedRoomsAndTheirNames() {

        ArrayList<Room> listOfOccupiedRooms = new ArrayList<>();
        for (Room room : listRoom) {
            if (room.getEmployee() != null) {
                listOfOccupiedRooms.add(room);
            }
        }

        return listOfOccupiedRooms;
    }

    // danh sách nhân viên chưa có phòng.
    @Override
    public List<Employee> employeeDoesNotHaveARoomYet(EmployeeServices employeeServices) {
        // danh sách phòng đã có người
        List<Room> showListOfOccupiedRoomsAndTheirNames = showListOfOccupiedRoomsAndTheirNames();

        // nhân viên đã có phòng
        List<Employee> employeeHasRoom = new ArrayList<>();
        for (Room room : showListOfOccupiedRoomsAndTheirNames) {
            employeeHasRoom.add(room.getEmployee());
        }

        // tất cả nhân viên
        List<Employee> employees = employeeServices.getAllEmployee();

        // Sử dụng iterator để duyệt qua danh sách employees và loại bỏ các nhân viên đã có phòng
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            for (Employee employee1 : employeeHasRoom) {
                if (employee1.getId() == employee.getId()) {
                    iterator.remove();
                    break;
                }
            }
        }

        return employees;
    }


    @Override
    public void update(long id, Room room) {
        Room roomEdit = getById(id);

        if (roomEdit == null) {
            System.out.println("Room not found");
            return;
        }

        roomEdit.setName(room.getName());
        roomEdit.setFloor(room.getFloor());
        roomEdit.setEmployee(room.getEmployee());
        System.out.println("Update room success");
    }

    @Override
    public void remove(long id) {
        Room roomRemove = getById(id);

        if (roomRemove == null) {
            System.out.println("Room not found");
            return;
        }

        listRoom.remove(roomRemove);
        System.out.println("Delete room successfully");
    }

    @Override
    public void book(long id, Room room) {
        Room roomBook = getById(id);

        if (roomBook == null) {
            System.out.println("Room not found");
            return;
        }
        roomBook.setEmployee(room.getEmployee());
        System.out.println("Book room success");

    }


    public void updateRoomAfterDeletingEmployee(long idEmployee) {
        // phòng đã có người
        List<Room> showListOfOccupiedRooms = showListOfOccupiedRoomsAndTheirNames();

        for (Room room : showListOfOccupiedRooms) {
            if (room.getEmployee().getId() == idEmployee) {
                room.setEmployee(null);
            }
        }
    }
}
