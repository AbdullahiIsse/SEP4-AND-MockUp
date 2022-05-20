package com.example.sep4andmockup.Controller;


import com.example.sep4andmockup.Entities.Measurements;
import com.example.sep4andmockup.Repository.MeasurementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurements")
public class MeasurementsController {

    @Autowired
    MeasurementsRepository measurementsRepository;



    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Measurements> getTemperature(){

        List<Measurements> measurements = measurementsRepository.findAll();

        return measurements;
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Measurements> getTemperatureByTerrariumId(@PathVariable("id") int id){

        return measurementsRepository.findByTerrariumId(id);
    }




}
