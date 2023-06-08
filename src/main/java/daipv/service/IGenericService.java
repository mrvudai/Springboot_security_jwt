package daipv.service;

import java.util.List;

public interface IGenericService <T,E>{
    List<T> findAll();
    boolean save(T t);
    boolean deleteById(E id);
    T findById(E id);
}
