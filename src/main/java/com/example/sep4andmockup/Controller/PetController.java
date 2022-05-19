package com.example.sep4andmockup.Controller;


import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetService petService;


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Pet addPet(@RequestBody Pet p){
        return petService.addPet(p);
    }


}
