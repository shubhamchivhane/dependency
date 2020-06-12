package com.di.dependency.services;

import com.di.dependency.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long> {

    //as its already implemented in crudservice interface we dont need to define it here

//    Vet findById(Long id);
//    Vet save(Vet vet);
//    Set<Vet> findAll();
}
