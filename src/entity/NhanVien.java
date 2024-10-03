package entity;

public class NhanVien {
    int id;
    String tenNhanVien;
    int age;
    String dob;
    String phoneNumber;
    String workAs;


    public NhanVien() {
    }

    public NhanVien(int id, String tenNhanVien, int age, String dob, String phoneNumber, String workAs) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.age = age;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.workAs = workAs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
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

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", tenNhanVien='" + tenNhanVien + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workAs='" + workAs + '\'' +
                '}';
    }
}
