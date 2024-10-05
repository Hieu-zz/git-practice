package Chef.ModelChef;

public class Table {
    int id;
    String name;
    String guestName;

    boolean isHasChef;
    Chef chef;

    public Table() {
    }

    public Table(int id, String name, String guestName,Chef chef) {
        this.id = id;
        this.name = name;
        this.guestName = guestName;
        this.chef = chef;
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
        return "Table+" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guestName='" + guestName + '\'' +
                ", chef=" + chef;
    }
    public void addChef(){

    }
}
