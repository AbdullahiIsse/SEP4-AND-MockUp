package com.example.sep4andmockup.Repository;

import com.example.sep4andmockup.Entities.Measurements;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeasurementsRepository extends CrudRepository<Measurements,Long> {


    @Override
     List<Measurements> findAll();

    List<Measurements>findByTerrariumId(long id);






}
