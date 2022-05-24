package com.example.sep4andmockup.Repository;

import com.example.sep4andmockup.Entities.Terrarium;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TerrariumRepository extends CrudRepository<Terrarium,Long> {



    @Override
    public List<Terrarium> findAll();

    List<Terrarium>getTerrariumByUserId(String id);






}
