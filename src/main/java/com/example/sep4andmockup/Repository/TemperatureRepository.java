package com.example.sep4andmockup.Repository;

import com.example.sep4andmockup.Entities.Temperature;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TemperatureRepository extends CrudRepository<Temperature,Long> {


    @Override
    public List<Temperature> findAll();

    List<Temperature>findByTerrariumId(long id);






}
