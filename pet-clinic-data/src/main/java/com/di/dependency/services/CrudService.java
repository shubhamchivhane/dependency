package com.di.dependency.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CrudService<T,ID>  {

    T findById(ID var1);

    Set<T> findAll();

    T save(T object);

    void deleteById(ID var1);

    void delete(T var1);
}
