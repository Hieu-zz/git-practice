package services.interfaces;

import exceptions.InvalidIdException;
import models.Chef;

import java.util.List;

public interface IChefServices {
    void create(Chef chef) throws InvalidIdException;

    void update(int id, Chef chef) throws InvalidIdException;

    void remove(int id) throws InvalidIdException;

    Chef getById(int id);

    List<Chef> getAll();

    List<Chef> getAllByStatus(boolean status);
}
