package service;

import model.Chef;

import java.util.List;

public interface ChefService extends BaseService<Chef>{
    List<Chef> getAllByStatus(boolean status);
}
