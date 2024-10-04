package services.interfaces;

import models.Chef;

import java.util.List;

public interface IChefServices {
    void create(Chef chef);

    void update(int id, Chef chef);

    void remove(int id);

    Chef getById(int id);

    List<Chef> getAll();

    List<Chef> getAllByStatus(boolean status);
}
