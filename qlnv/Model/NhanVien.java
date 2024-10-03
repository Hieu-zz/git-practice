package qlnv.Model;

public class NhanVien {
    long id;
    String name, DOB, phoneNumber, workAs;
    int age;

    public NhanVien() {
    }

    public NhanVien(long id, String name, String DOB, String phoneNumber, String workAs, int age) {
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

    public void setId(double randomDouble) {
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

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workAs='" + workAs + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }


}
