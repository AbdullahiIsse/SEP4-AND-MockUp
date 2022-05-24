package com.example.sep4andmockup;

import com.example.sep4andmockup.Entities.Pet;

import java.util.List;

public interface PetService {

    Pet addPet(Pet p);

    List<Pet> findByTerrariumId(long id);

    void deletePet(long id);


}
