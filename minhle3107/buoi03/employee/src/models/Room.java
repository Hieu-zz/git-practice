package models;

public class Room {
    long id;
    String name;
    int floor;
    Employee employee;

    public Room() {
    }

    public Room(long id, String name, int floor, Employee employee) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                ", employee=" + employee +
                '}';
    }
}
