package com.example.sep4andmockup.Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "temperature")
public class Temperature {

    @Id
    @Column(name = "temperature_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "temperature_generator")
    @SequenceGenerator(name = "temperature_generator", sequenceName = "temperature_seq", allocationSize = 1)
    private long id;
    private double temperatureCelsius;
    private LocalDateTime temperatureDate;
    private long terrariumId;

    public Temperature() {

    }

    public Temperature(double temperatureCelsius, LocalDateTime temperatureDate, long terrariumId) {
        this.temperatureCelsius = temperatureCelsius;
        this.temperatureDate = temperatureDate;
        this.terrariumId = terrariumId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public LocalDateTime getTemperatureDate() {
        return temperatureDate;
    }

    public void setTemperatureDate(LocalDateTime temperatureDate) {
        this.temperatureDate = temperatureDate;
    }

    public long getTerrariumId() {
        return terrariumId;
    }

    public void setTerrariumId(long terrariumId) {
        this.terrariumId = terrariumId;
    }
}
