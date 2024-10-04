package service;

import java.io.IOException;
import java.util.List;

public interface BaseService<T> {
    List<T> getAll() throws IOException;
    T getById(long id);
    void create(T t) throws IOException;
    void update(T t);
    void delete(long id);
}
