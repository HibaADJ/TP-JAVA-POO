package dao.interfaces;

import java.util.List;

import java.util.List;
public interface MainDao<T> {
    List<T> getAll();
    T getById(int id);
    void save(T t);
    void update(T t);
    void delete(int id);
}