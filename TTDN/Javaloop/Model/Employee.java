package Model;

public class Employee {
    long id;
    String name;
    int age;
     String DOB;

     String phoneNumber;
     String workAs;

     boolean hasRoom;

    public Employee() {
    }

    public Employee(long id, String name, int age, String DOB, String phoneNumber, String workAs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.workAs = workAs;
        this.hasRoom = false;
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

    public boolean isHasRoom() {
        return hasRoom;
    }

    public void setHasRoom(boolean hasRoom) {
        this.hasRoom = hasRoom;
    }
}
