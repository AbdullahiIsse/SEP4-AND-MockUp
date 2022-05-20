package com.example.sep4andmockup.Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "measurements")
public class Measurements {

    @Id
    @Column(name = "measurements_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "measurements_generator")
    @SequenceGenerator(name = "measurements_generator", sequenceName = "measurements_seq", allocationSize = 1)
    private long id;
    private double measurement_temp;
    private double measurement_air;
    private double measurement_co2;
    private LocalDateTime measurements_date;
    private long terrariumId;

    public Measurements() {

    }

    public Measurements(double measurement_temp, double measurement_air, double measurement_co2, LocalDateTime measurements_date, long terrariumId) {
        this.measurement_temp = measurement_temp;
        this.measurement_air = measurement_air;
        this.measurement_co2 = measurement_co2;
        this.measurements_date = measurements_date;
        this.terrariumId = terrariumId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMeasurement_temp() {
        return measurement_temp;
    }

    public void setMeasurement_temp(double measurement_temp) {
        this.measurement_temp = measurement_temp;
    }

    public double getMeasurement_air() {
        return measurement_air;
    }

    public void setMeasurement_air(double measurement_air) {
        this.measurement_air = measurement_air;
    }

    public double getMeasurement_co2() {
        return measurement_co2;
    }

    public void setMeasurement_co2(double measurement_co2) {
        this.measurement_co2 = measurement_co2;
    }

    public LocalDateTime getMeasurements_date() {
        return measurements_date;
    }

    public void setMeasurements_date(LocalDateTime measurements_date) {
        this.measurements_date = measurements_date;
    }

    public long getTerrariumId() {
        return terrariumId;
    }

    public void setTerrariumId(long terrariumId) {
        this.terrariumId = terrariumId;
    }
}
