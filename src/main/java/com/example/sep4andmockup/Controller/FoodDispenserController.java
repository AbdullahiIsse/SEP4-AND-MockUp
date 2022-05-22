package com.example.sep4andmockup.Controller;


import com.example.sep4andmockup.Entities.FoodDispenser;
import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.FoodDispenserService;
import com.example.sep4andmockup.PetService;
import com.example.sep4andmockup.Repository.FoodDispenserRepository;
import com.example.sep4andmockup.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodDispenserController {


    @Autowired
    FoodDispenserService foodDispenserService;

    @Autowired
    FoodDispenserRepository foodDispenserRepository;



    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public FoodDispenser addFood(@RequestBody FoodDispenser addFood){
        return foodDispenserService.addFood(addFood);
    }
}
