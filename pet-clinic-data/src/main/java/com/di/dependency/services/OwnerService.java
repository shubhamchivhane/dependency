
package com.di.dependency.services;

import com.di.dependency.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findById(Long id);
    //as its already implemented in crudservice interface we dont need to define it here
//    Owner save(Owner owner);
//    Set<Owner> findAll();
//    Owner findByLastName(String lastName);
}
