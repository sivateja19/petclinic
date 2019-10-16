package com.app.petclinic.services.map;

import com.app.petclinic.model.Pet;
import com.app.petclinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
