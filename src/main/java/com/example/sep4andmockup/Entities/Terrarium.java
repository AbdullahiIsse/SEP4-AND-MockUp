package com.example.sep4andmockup.Entities;

import javax.persistence.*;

@Entity
@Table(name = "terrarium")
public class Terrarium {

    @Id
    @Column(name = "terrarium_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terrarium_generator")
    @SequenceGenerator(name = "terrarium_generator", sequenceName = "terrarium_seq", allocationSize = 1)
    private long id;
    private String terrariumName;
    private String userId;

    public Terrarium() {

    }


    public Terrarium(String terrariumName, String userId) {
        this.terrariumName = terrariumName;
        this.userId = userId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTerrariumName() {
        return terrariumName;
    }

    public void setTerrariumName(String terrariumName) {
        this.terrariumName = terrariumName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }





}
