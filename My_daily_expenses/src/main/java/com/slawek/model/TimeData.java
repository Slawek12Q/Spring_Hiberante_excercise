package com.slawek.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TimeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String price;
    private String description;
    private LocalDateTime localDateTime;

    public TimeData(){}

    public TimeData(String price, String description) {
        this.price = price;
        this.description = description;
        this.localDateTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
