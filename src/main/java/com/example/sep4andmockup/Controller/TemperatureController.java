package com.example.sep4andmockup.Controller;


import com.example.sep4andmockup.Entities.Temperature;
import com.example.sep4andmockup.Entities.Terrarium;
import com.example.sep4andmockup.Repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    @Autowired
    TemperatureRepository temperatureRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Temperature> getTemperature(){

        List<Temperature> temperatures = temperatureRepository.findAll();

        return temperatures;
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Temperature> getTemperatureByTerrariumId(@PathVariable("id") int id){

        return temperatureRepository.findByTerrariumId(id);
    }




}
