package service.impl;

import model.Chef;
import model.Table;
import service.TableService;
import util.FileAction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TableServiceImplement implements TableService {
    public List<Table> tableList=new ArrayList<>();

    public TableServiceImplement() {
        tableList.add(new Table(1, "Bàn số 1", "Dương", null));
        tableList.add(new Table(2, "Bàn số 2", "Dương", null));
        tableList.add(new Table(3, "Bàn số 3", "Dương", null));
        tableList.add(new Table(4, "Bàn số 4", "Dương", null));
        tableList.add(new Table(5, "Bàn số 5", "Dương", null));
    }

    @Override
    public List<Table> getAll() {
        return this.tableList;
    }

    @Override
    public Table getById(long id) {
        return this.tableList.stream().filter(x->x.getId()==id).toList().get(0);
    }

    @Override
    public void create(Table table) {
        this.tableList.add(table);

    }

    @Override
    public void update(Table table) {
        Table slt_table=this.tableList.stream().filter(x->x.getId()==table.getId()).toList().get(0);
        slt_table.setName(table.getName());
        slt_table.setGuestName(table.getGuestName());
        slt_table.setChef(table.getChef());
    }

    @Override
    public void delete(long id) {
        this.tableList.remove(this.tableList.stream().filter(x->x.getId()==id).toList().get(0));
    }

    @Override
    public List<Table> getAllWithChef() {
        return this.tableList.stream().filter(x->x.getChef()!=null).collect(Collectors.toList());
    }

    @Override
    public List<Table> getAllWithoutChef() {
        return this.tableList.stream().filter(x->x.getChef()==null).toList();
    }

    @Override
    public void phan_cong(int tableId, Chef chef) {
        this.tableList.stream().filter(x->x.getId()==tableId).toList().get(0).setChef(chef);
    }
}
