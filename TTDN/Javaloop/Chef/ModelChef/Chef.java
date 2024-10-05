package Chef.ModelChef;

public class Chef {
    int Id;
    String name;

    String phoneNumber;

    boolean status;

    public Chef() {
    }

    public Chef(int id, String name, String phoneNumber, boolean status) {
        Id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.status = true;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
        return "Chef: " +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", status=" + status;
    }
}
