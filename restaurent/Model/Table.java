package restaurent.Model;

public class Table {
    private int ID;
    private String name, guestName;
    private Chef chef;

    public Table() {
    }

    public Table(int ID, String name, String guestName, Chef chef) {
        this.ID = ID;
        this.name = name;
        this.guestName = guestName;
        this.chef = chef;
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

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    @Override
    public String toString() {
        return "Table{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", guestName='" + guestName + '\'' +
                ", chef=" + chef +
                '}';
    }
}
