package org.example.quanlynhanvien.models;

public class Room {
    private String name;
    private int floor;
    private Employee employee;

    public Room() {
    }

    public Room(String name, int floor, Employee employee) {
        this.name = name;
        this.floor = floor;
        this.employee = employee;
    }

    public Room(String name,int floor){
        this.name = name;
        this.floor = floor;
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
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", employee=" + employee +
                '}';
    }
}
