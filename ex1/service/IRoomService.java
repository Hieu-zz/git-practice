package ex1.service;

import ex1.model.Room;

import java.util.List;

public interface IRoomService{
    List<Room> getAll();
    void delete(long id);

    void insert(Room room);

    void update(Room room);
    Room findById(long id);
    List<Room> getAllRoomAvai();
    void phancong(long eid, long rid, IEmployeeService employeeService);
}
