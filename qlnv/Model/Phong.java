package qlnv.Model;

public class Phong {
    String name;
    int floor;
    NhanVien employee;

    public Phong() {
    }

    public Phong(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }

    public Phong(String name, int floor, NhanVien employee) {
        this.name = name;
        this.floor = floor;
        this.employee = employee;
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

    public NhanVien getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", employee=" + employee +
                '}';
    }

    public void setEmployee(NhanVien employee) {
        this.employee = employee;
    }
}
