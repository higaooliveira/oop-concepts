package com.higor.abstracao;

public class Car {
    public int maxVelocity;
    public int currentVelocity;
    public String brand;
    public String model;

    public Car() {}

    public Car(int maxVelocity, int currentVelocity, String brand, String model) {
        this.maxVelocity = maxVelocity;
        this.currentVelocity = currentVelocity;
        this.brand = brand;
        this.model = model;
    }
}
