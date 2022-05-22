package com.example.sep4andmockup.Controller;


import com.example.sep4andmockup.Entities.Measurements;
import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetService petService;



    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Pet> getPetsByTerrariumId(@PathVariable("id") long id){

        return petService.findByTerrariumId(id);
    }



    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Pet addPet(@RequestBody Pet p){
        return petService.addPet(p);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePet(@PathVariable("id") long id){
        petService.deletePet(id);
    }



}
