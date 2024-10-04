package org.example.quanlynhahang.models;

public class Chef {
    public int Id;
    public String Name;
    public String phoneNumber;
    public boolean status;

    public Chef() {
    }

    public Chef(int id, String name, String phoneNumber, boolean status) {
        Id = id;
        Name = name;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", status=" + status +
                '}';
    }
}
