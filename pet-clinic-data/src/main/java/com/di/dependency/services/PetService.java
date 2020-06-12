package com.di.dependency.services;

import com.di.dependency.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet,Long>{

    //as its already implemented in crudservice interface we dont need to define it here
//    Pet findById(Long id);
//    Pet save(Pet pet);
//    Set<Pet> findAll();

}
