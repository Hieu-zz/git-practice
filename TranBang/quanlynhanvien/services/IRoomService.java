package org.example.quanlynhanvien.services;

import org.example.quanlynhanvien.models.Employee;
import org.example.quanlynhanvien.models.Room;

import java.util.List;

public interface IRoomService {
    List<Room> viewAllRoom();
    void addRoom();
    void updateRoom();
    void deleteRoom();
    List<Room> getEmptyRoom();
    List<Employee> getEmployeeByRoom();
    Room getByName(String name);
    void addEmployeeToRoom(long eId, String roomName);
    List<Room> getRoomsEmployee();
    void deleteEmployeeFromRoom(long eId, String roomName);
}
