package restaurent.Model;

public class Chef {
    private int ID;
    private String name,phoneNumer;
    private boolean status; //bep truong co di lam hay khong

    public Chef() {
    }

    public Chef(int ID, String name, String phoneNumer, boolean status) {
        this.ID = ID;
        this.name = name;
        this.phoneNumer = phoneNumer;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
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
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", phoneNumer='" + phoneNumer + '\'' +
                ", status=" + status +
                '}';
    }
}
