package controllers;

import exceptions.InvalidIdException;
import models.Employee;
import models.Room;
import services.EmployeeServices;
import services.RoomServices;

import java.util.List;

public class RoomController {

    protected RoomServices roomServices;
    protected EmployeeServices employeeServices;

    public RoomController() {
    }

    public RoomController(RoomServices roomServices, EmployeeServices employeeServices) {
        this.roomServices = roomServices;
        this.employeeServices = employeeServices;
    }

    public Room getById(long id) {
        return roomServices.getById(id);
    }

    public List<Room> getAll() {
        return roomServices.getAllRoom();
    }

    public void create(Room room) throws InvalidIdException {
        roomServices.create(room);

    }


    // Hiển thị danh sách phòng trống
    public List<Room> showListOfAvailableRooms() {
        return roomServices.showListOfAvailableRooms();
    }

    // Phong da co nguoi
    public List<Room> showListOfOccupiedRoomsAndTheirNames() {
        return roomServices.showListOfOccupiedRoomsAndTheirNames();
    }

    public void remove(long id) {
        roomServices.remove(id);
    }

    public void updateRoom(long id, Room room) {
        roomServices.update(id, room);
    }

    public void bookRoom(long id, Room room) {
        roomServices.book(id, room);
    }

    // Danh sách nhân viên chưa có phòng
    public List<Employee> employeeDoesNotHaveARoomYet() {
        return roomServices.employeeDoesNotHaveARoomYet(employeeServices);
    }

    // cập nhật lại phòng có nhân viên bị xóa
    public void updateRoomAfterDeletingEmployee(long idEmployee) {
        roomServices.updateRoomAfterDeletingEmployee(idEmployee);
    }
}
