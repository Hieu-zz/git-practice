package Model;

public class Phong {
    String name;
    int floor;
    Employee employee;


    public Phong() {
    }

    public Phong(String name, int floor) {
        this.name = name;
        this.floor = floor;
        this.employee = null;
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
}
