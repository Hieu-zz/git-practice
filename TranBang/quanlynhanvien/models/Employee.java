package org.example.quanlynhanvien.models;

public class Employee {
    private long eId;
    private String name;
    private String dob;
    private int age;
    private String phone;
    private String workAs;

    public Employee() {
    }

    public Employee(long eId, String name, String dob, int age, String phone, String workAs) {
        this.eId = eId;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.phone = phone;
        this.workAs = workAs;
    }

    public long geteId() {
        return eId;
    }

    public void seteId(long eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkAs() {
        return workAs;
    }

    public void setWorkAs(String workAs) {
        this.workAs = workAs;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", workAs='" + workAs + '\'' +
                '}';
    }
}
