package qlnv.Service.IEmployeeService;

import qlnv.Modal.Employee;
import qlnv.Modal.Room;

import java.util.List;

public interface IRoomService {
    List<Room> getAll();
    List<Room> add();
    List<Room> empty();
    void delete(long id);
}
