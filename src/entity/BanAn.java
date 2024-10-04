package entity;

public class BanAn {
    private int id;
    private String name;
    private String guestName;
    BepTruong bepTruong;

    public BanAn() {
    }

    public BanAn(int id, String name, String guestName, BepTruong bepTruong) {
        this.id = id;
        this.name = name;
        this.guestName = guestName;
        this.bepTruong = bepTruong;
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

    public BepTruong getBepTruong() {
        return bepTruong;
    }

    public void setBepTruong(BepTruong bepTruong) {
        this.bepTruong = bepTruong;
    }

    @Override
    public String toString() {
        return "BanAn[" +
                "id=" + id +
                "| name='" + name + '\'' +
                "| guestName='" + guestName + '\'' +
                "| bepTruong=" + bepTruong +
                ']';
    }
}
