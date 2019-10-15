package com.app.petclinic.services;

import com.app.petclinic.model.Pet;
import com.app.petclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();

}
