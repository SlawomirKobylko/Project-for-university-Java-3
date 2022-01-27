package com.company;

public class Car {
    //zadanie 2
    final String model;
    final String producer;
    Integer weight;
    Double cost;
    Double ofkoz;

    Car (String producer, String model, Integer weight, Double cost, Double ofkoz){
        this.producer = producer;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
        this.ofkoz = ofkoz;
    }

}
