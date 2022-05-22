package com.example.sep4andmockup.Repository;

import com.example.sep4andmockup.Entities.Measurements;
import com.example.sep4andmockup.Entities.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet,Long> {



    List<Pet> findByTerrariumId(long id);




}
