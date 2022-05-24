package com.example.sep4andmockup.Controller;


import com.example.sep4andmockup.Entities.Measurements;
import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.Entities.Terrarium;
import com.example.sep4andmockup.PetService;
import com.example.sep4andmockup.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;







@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetService petService;

    @Autowired
    PetRepository petRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Pet> getPets(){

        return (List<Pet>) petRepository.findAll();
    }



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


    @PatchMapping("/{id}")
    public Pet UpdatePetByPetId(@RequestBody Pet pet , @PathVariable("id") long id){

        Pet pet1 = petRepository.findById(id).get();

        if (pet.getName()!= null){
            pet1.setName(pet.getName());
        }

        if (pet.getSpecies() != null){
            pet1.setSpecies(pet.getSpecies());
        }

        if (pet.getAge() != 0){
            pet1.setAge(pet.getAge());
        }

        return petRepository.save(pet1);

    }







}
