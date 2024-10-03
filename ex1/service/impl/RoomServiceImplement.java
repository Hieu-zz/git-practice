package ex1.service.impl;

import ex1.model.Room;
import ex1.service.IEmployeeService;
import ex1.service.IRoomService;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImplement implements IRoomService {
    public List<Room> roomList = new ArrayList<>();

    @Override
    public List<Room> getAll() {
        return this.roomList;
    }

    @Override
    public void delete(long id) {
        this.roomList.remove(roomList.stream().filter(x -> x.getId() == id).toList().get(0));
    }

    @Override
    public void insert(Room room) {
        this.roomList.add(room);
    }

    @Override
    public void update(Room room) {
        Room selectedRoom = this.roomList.stream().filter(x -> x.getId() == room.getId()).toList().get(0);
        selectedRoom.setName(room.getName());
        selectedRoom.setFloor(room.getFloor());
        selectedRoom.setEmployee(room.getEmployee());
    }

    @Override
    public Room findById(long id) {
        return this.roomList.stream().filter(x->x.getId()==id).toList().get(0);
    }

    @Override
    public List<Room> getAllRoomAvai() {
        return this.roomList.stream().filter(x->x.getEmployee()==null).toList();
    }

    @Override
    public void phancong(long eid, long rid, IEmployeeService employeeService) {
        this.roomList.stream().filter(x->x.getId()==rid).toList().get(0).setEmployee(employeeService.findById(eid));
    }
}
