package restaurent.Service.ChefService;

import restaurent.Model.Chef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class    ChefService implements IChefService{
    List<Chef> chefs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public ChefService(){
        chefs.add(new Chef(1, "Nguyen Van A","0929557336", true));
        chefs.add(new Chef(2, "Nguyen Van B","0929557337", false));
        chefs.add(new Chef(3, "Nguyen Van C","0929557338", true));
    }
    @Override
    public List<Chef> getAllByStatus(boolean status) {
        List<Chef> workingChef = new ArrayList<>();
        List<Chef>  absentChef = new ArrayList<>();
        for (Chef chef : chefs){
            if (chef.isStatus()){
                workingChef.add(chef);
            }else {
                absentChef.add(chef);
            }
        }
        if ( status == true){
            return workingChef;
        }else {
            return absentChef;
        }
    }

    @Override
    //lay danh sach
    public void getAll() {
        for (Chef chef :chefs){
            System.out.println(chef.toString());
        }
    }


    //lay theo id
    public Chef getByID(int ID) {
        for(Chef chef :chefs){
            if(chef.getID() == ID){
                return chef;
            }
        }
        return null;
    }

    @Override
    //Xoa bep truong
    public void create() {
        System.out.println("Moi nhap vao id");
        int ID = sc.nextInt();
        System.out.println("Moi nhap vao ten dau bep");
        String name = sc.next();
        System.out.println("Moi nhap vao so dien thoai");
        String phoneNumber = sc.next();
        System.out.println("moi nhap trang thai");
        boolean status = sc.nextBoolean();
        Chef chef = new Chef(ID, name, phoneNumber, status);
        chefs.add(chef);
        getAll();
    }

    @Override
    //Sua thong tin
    public void update() {
        int ID = sc.nextInt();
        Chef chef = getByID(ID);
        System.out.println("Moi nhap vao ten dau bep");
        chef.setName(sc.next());
        System.out.println("Moi nhap vao so dien thoai");
        chef.setPhoneNumer(sc.next());
        System.out.println("moi nhap trang thai");
        chef.setStatus(sc.nextBoolean());
        getAll();
    }

    @Override
    //Xoa thong tin
    public void delete() {
        int ID = sc.nextInt();
        chefs.remove(getByID(ID));
        getAll();
    }

}
