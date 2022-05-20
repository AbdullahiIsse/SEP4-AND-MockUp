package com.example.sep4andmockup;

import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PetServiceImpl implements PetService{

    @Autowired
    PetRepository petRepository;

    @Override
    public Pet addPet(Pet p) {
        return petRepository.save(p);
    }
}
