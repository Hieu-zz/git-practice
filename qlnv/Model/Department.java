package qlnv.Model;

import java.util.Objects;

public class Department {
      private String name;
      private int floor;
      private Employee employee;

    public Department() {
    }

    public Department(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }

    public Department(String name, int floor, Employee employee) {
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", employee=" + employee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

}
