package com.example.sep4andmockup.Controller;

import com.example.sep4andmockup.Entities.Terrarium;
import com.example.sep4andmockup.Repository.TerrariumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terrarium")
public class TerrariumController {


    @Autowired
    TerrariumRepository terrariumRepository;



    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Terrarium>getTerrarium(){

        List<Terrarium> terrariums = terrariumRepository.findAll();

        return terrariums;
    }



    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Terrarium> getTerrariumByUserId(@PathVariable("id") long id){

        return terrariumRepository.getTerrariumByUserId(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Terrarium getTerrariumById(@PathVariable("id") long id){

        return terrariumRepository.findById(id).get();
    }










}
