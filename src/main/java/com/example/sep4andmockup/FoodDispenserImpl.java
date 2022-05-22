package com.example.sep4andmockup;

import com.example.sep4andmockup.Entities.FoodDispenser;
import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.Repository.FoodDispenserRepository;
import com.example.sep4andmockup.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodDispenserImpl implements FoodDispenserService{


    @Autowired
    FoodDispenserRepository foodDispenserRepository;

    @Override
    public FoodDispenser addFood(FoodDispenser addFood) {
        return foodDispenserRepository.save(addFood);
    }

}
