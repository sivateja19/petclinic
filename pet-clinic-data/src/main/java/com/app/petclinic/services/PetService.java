package com.app.petclinic.services;

import com.app.petclinic.model.Owner;
import com.app.petclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long>{

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
