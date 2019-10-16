package com.app.petclinic.services.map;

import com.app.petclinic.model.Owner;
import com.app.petclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner t) {

    }

    @Override
    public void deleteById(Long ID) {

    }
}
