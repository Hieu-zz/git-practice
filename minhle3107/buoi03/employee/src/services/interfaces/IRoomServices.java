package services.interfaces;

import exceptions.InvalidIdException;
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

    void create(Room room)  throws InvalidIdException;

    void update(long id, Room room);

    void remove(long id);

    void book(long id, Room room);
}
