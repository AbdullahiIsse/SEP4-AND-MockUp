package com.example.sep4andmockup.Entities;


import javax.persistence.*;

@Entity
@Table(name = "fooddispenser")
public class FoodDispenser {

    @Id
    @Column(name = "food_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fooddispenser_generator")
    @SequenceGenerator(name = "fooddispenser_generator", sequenceName = "fooddispenser_seq", allocationSize = 1)
    private long id;
    private int food;
    private long terrariumId;

    public FoodDispenser() {
    }

    public FoodDispenser(int food, long terrariumId) {
        this.food = food;
        this.terrariumId = terrariumId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public long getTerrariumId() {
        return terrariumId;
    }

    public void setTerrariumId(long terrariumId) {
        this.terrariumId = terrariumId;
    }
}
