package com.slawek.model;


import javax.persistence.*;

@Entity
public class TimeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String price;
    private String decription;

    TimeData(){}

    public TimeData(String price, String decription) {
        this.price = price;
        this.decription = decription;
    }

    public int getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public String getDecription() {
        return decription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
