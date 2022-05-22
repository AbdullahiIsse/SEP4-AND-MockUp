package com.example.sep4andmockup.Entities;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pet")
public class Pet {


    @Id
    @Column(name = "pet_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_generator")
    @SequenceGenerator(name = "pet_generator", sequenceName = "pet_seq", allocationSize = 1)
    private long id;
    private String name;
    private String species;
    private int age;
    private long terrariumId;


    public Pet() {
    }


    public Pet(String name, String species, int age, long terrariumId) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.terrariumId = terrariumId;
    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTerrariumId() {
        return terrariumId;
    }

    public void setTerrariumId(long terrariumId) {
        this.terrariumId = terrariumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
