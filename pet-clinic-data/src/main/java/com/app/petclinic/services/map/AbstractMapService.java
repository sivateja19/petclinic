package com.app.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService<T, ID> {

    protected Map<ID, T> map= new HashMap<>();

    T findById(ID id){
        return map.get(id);
    }
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T save(ID id, T t){
        map.put(id, t);
        return t;
    }
    void delete(T t){
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
    void deleteById(ID id){
        map.remove(id);
    }
}
