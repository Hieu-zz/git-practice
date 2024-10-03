package ex1.model;

public class Employee {
    private long id;
    private String name;
    private int age;
    private String dob;
    private String phoneNumber;
    private String workAs;
    private long roomId;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public Employee() {
    }

    public Employee(long id, String name, int age, String dob, String phoneNumber, String workAs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.workAs = workAs;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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
}
