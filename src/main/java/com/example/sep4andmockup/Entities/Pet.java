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


    public Pet() {
    }


    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
