package qlnh.Modal;

public class Chef {
    int id ;
    String name ;
    String phoneNumber ;
    boolean Status ;

    public Chef(int id, String name, String phoneNumber, boolean status) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        Status = status;
    }

    public Chef() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Status=" + Status +
                '}';
    }
}
