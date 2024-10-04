package entity;

public class BepTruong {
    private int id;
    private String name;
    private String phoneNumber;
    private boolean status;

    public BepTruong() {
    }

    public BepTruong(int id, String name, String phoneNumber, boolean status) {
        this.status = status;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.id = id;
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
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BepTruong[" +
                "id=" + id +
                "| name='" + name + '\'' +
                "| phoneNumber='" + phoneNumber + '\'' +
                "| status=" + status +
                ']';
    }
}
