package qlnh.Modal;

public class Table {
    int id;
    String name ;
    String guestNam;
    Chef chef;

    public Table() {
    }

    public Table(int id, String name, String guestNam, Chef chef) {
        this.id = id;
        this.name = name;
        this.guestNam = guestNam;
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

    public String getGuestNam() {
        return guestNam;
    }

    public void setGuestNam(String guestNam) {
        this.guestNam = guestNam;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", guestNam='" + guestNam + '\'' +
                ", chef=" + chef +
                '}';
    }
}
