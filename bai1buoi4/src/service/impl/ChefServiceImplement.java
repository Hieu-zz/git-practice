package service.impl;

import model.Chef;
import service.ChefService;

import java.util.ArrayList;
import java.util.List;

public class ChefServiceImplement implements ChefService {
    public List<Chef> chefList= new ArrayList<>();

    public ChefServiceImplement() {
        chefList.add(new Chef(1, "Chef1", "0934274635", true));
        chefList.add(new Chef(2, "Chef2", "0934274635", true));
        chefList.add(new Chef(3, "Chef3", "0934274635", true));
        chefList.add(new Chef(4, "Chef4", "0934274635", true));
        chefList.add(new Chef(5, "Chef5", "0934274635", true));
    }

    @Override
    public List<Chef> getAll() {
        return this.chefList;
    }

    @Override
    public Chef getById(long id) {
        return this.chefList.stream().filter(x->x.getId()==id).toList().get(0);
    }

    @Override
    public void create(Chef chef) {
        this.chefList.add(chef);
    }

    @Override
    public void update(Chef chef) {
        Chef slt_chef=this.chefList.stream().filter(x->x.getId()==chef.getId()).toList().get(0);
        slt_chef.setName(chef.getName());
        slt_chef.setStatus(chef.getStatus());
        slt_chef.setPhoneNumber(chef.getPhoneNumber());
    }

    @Override
    public void delete(long id) {
        this.chefList.remove(this.chefList.stream().filter(x->x.getId()==id).toList().get(0));
    }

    @Override
    public List<Chef> getAllByStatus(boolean status) {
        return this.chefList.stream().filter(x->x.getStatus()==status).toList();
    }
}
