package services.interfaces;

import models.Employee;
import models.Room;
import services.EmployeeServices;

import java.util.List;

public interface IRoomServices {
    Room getById(long id);

    List<Room> getAllRoom();

    List<Room> showListOfAvailableRooms();

    List<Room> showListOfOccupiedRoomsAndTheirNames();

    List<Employee> employeeDoesNotHaveARoomYet(EmployeeServices employeeServices);

    void create(Room room);

    void update(long id, Room room);

    void remove(long id);

    void book(long id, Room room);
}
