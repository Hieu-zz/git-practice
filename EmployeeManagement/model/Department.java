package EmployeeManagement.model;

public class Department {
    String name;
    int floor;
    boolean hasEmployee = false;
    Employee employee;

    public Department(String name, int floor, boolean hasEmployee, Employee employee) {
        this.name = name;
        this.floor = floor;
        this.hasEmployee = hasEmployee;
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

    public boolean isHasEmployee() {
        return hasEmployee;
    }

    public void setHasEmployee(boolean hasEmployee) {
        this.hasEmployee = hasEmployee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return name + " [floor=" + floor + ", hasEmployee=" + hasEmployee + ", employee=" + employee + "]";
    }

}
