package com.app.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(Long ID);
    Set<T> findAll();
    T save(T t);
    void delete(T t);
    void deleteById(Long ID);

}
