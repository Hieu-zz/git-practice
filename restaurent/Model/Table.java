package restaurent.Model;


import restaurent.Service.ChefService.ChefService;
import restaurent.Service.TableService.TableService;
import java.util.List;
import java.util.Scanner;

public class Table {
    private int ID;
    private String name, guestName;
    private Chef chef;
    Scanner sc = new Scanner(System.in);
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

    public void addChef(){
        System.out.println("Danh sach ban khong co bep truong phu trach");
        TableService tableService = new TableService();
        tableService.getAllWithoutChef();
        System.out.println("Danh sach bep truong di lam");
        ChefService chefService = new ChefService();
        List<Chef> chefs = chefService.getAllByStatus(true);
        for (Chef chef1: chefs){
            System.out.println(chef1.toString());
        }

        System.out.println("Moi lua chon ID ban");
        int ID = sc.nextInt();
        System.out.println("Moi lua chon ID beeps truong");
        int IDC = sc.nextInt();
        Table table = tableService.getByID(ID);
        Chef chef2 = chefService.getByID(IDC);
        table.setChef(chef2);
        tableService.getAll();
    }

    public void delChef(){
        System.out.println("Danh sach ban  co bep truong phu trach");
        TableService tableService = new TableService();
        tableService.getAllWithChef();
        System.out.println("Chon ID ban muon xoa bep truong");
        int ID = sc.nextInt();
        Table table = tableService.getByID(ID);
        table.setChef(null);
        tableService.getAll();
    }
}
