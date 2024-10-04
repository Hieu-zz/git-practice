package org.example.quanlynhahang.models;

public class Table {
    public int ID;
    public String Name;
    String guestName;
    Chef chef;

    public Table() {
    }

    public Table(int ID, String name, String guestName, Chef chef) {
        this.ID = ID;
        Name = name;
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
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public void addChef(Chef chef){


    }
    public void removeChef(){

    }




    @Override
    public String toString() {
        return "Table{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", guestName='" + guestName + '\'' +
                ", chef=" + chef +
                '}';
    }
}
