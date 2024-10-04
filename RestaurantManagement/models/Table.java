package RestaurantManagement.models;

public class Table {
    int id;
    String name;
    String guestName;
    Chef chef;

    public Table(int id, String name, String guestName, Chef chef) {
        this.id = id;
        this.name = name;
        this.guestName = guestName;
        this.chef = chef;
    }

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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
        return "Table " + name + " [id=" + id + ", guestName=" + guestName + ", chef=" + chef + "]";
    }

    public void addChef(Chef chef) {
        this.chef = chef;
    }

    public void removeChef() {
        this.chef = null;
    }

    public boolean hasChef() {
        return this.chef != null;
    }
}
