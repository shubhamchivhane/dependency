package com.di.dependency.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private PetType pettype;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPettype() {
        return pettype;
    }

    public void setPettype(PetType pettype) {
        this.pettype = pettype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
