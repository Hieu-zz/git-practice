package EmployeeManagement.model;

public class Employee {
    long id;
    String name;
    int age;
    String DOB;
    String phoneNumber;
    String workAs;
    boolean inDepartment = false;

    public Employee(long id, String name, int age, String dOB, String phoneNumber, String workAs,
            boolean inDepartment) {
        this.id = id;
        this.name = name;
        this.age = age;
        DOB = dOB;
        this.phoneNumber = phoneNumber;
        this.workAs = workAs;
        this.inDepartment = inDepartment;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String dOB) {
        DOB = dOB;
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

    public boolean isInDepartment() {
        return inDepartment;
    }

    public void setInDepartment(boolean inDepartment) {
        this.inDepartment = inDepartment;
    }

    @Override
    public String toString() {
        return name + " [id=" + id + ", age=" + age + ", DOB=" + DOB + ", phoneNumber="
                + phoneNumber + ", workAs=" + workAs + ", inDepartment=" + inDepartment + "]";
    }

}
