package com.di.dependency.map;

import com.di.dependency.model.Owner;
import com.di.dependency.services.CrudService;
import net.bytebuddy.implementation.bind.annotation.Super;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteByID(Id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
