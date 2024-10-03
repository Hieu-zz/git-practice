package qlnv.Model;

public class Employee {
     private long id;
     private String name, DOB, phoneNumber, workAs;
     private int age;

    public Employee() {
    }

    public Employee(long id, String name, String DOB, String phoneNumber, String workAs, int age) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.workAs = workAs;
        this.age = age;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkAs() {
        return workAs;
    }

    public void setWorkAs(String workAs) {
        this.workAs = workAs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workAs='" + workAs + '\'' +
                ", age=" + age +
                '}';
    }
}
