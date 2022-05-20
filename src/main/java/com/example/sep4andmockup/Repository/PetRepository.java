package com.example.sep4andmockup.Repository;

import com.example.sep4andmockup.Entities.Pet;
import com.example.sep4andmockup.Entities.Temperature;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {


}
