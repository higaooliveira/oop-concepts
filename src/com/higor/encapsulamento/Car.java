package com.higor.encapsulamento;

public class Car {
    private int maxVelocity;
    private int currentVelocity;
    private String brand;
    private String model;

    public Car() {}

    public Car(int maxVelocity, int currentVelocity, String brand, String model) {
        this.maxVelocity = maxVelocity;
        this.currentVelocity = currentVelocity;
        this.brand = brand;
        this.model = model;
    }

    public void speedUp() {
        while (this.getCurrentVelocity() < this.getMaxVelocity()) {
            int previousVelocity = this.getCurrentVelocity();
            this.setCurrentVelocity(previousVelocity + 1);
            System.out.println("Velocidade atual do seu carro  " + this.getCurrentVelocity());
        }
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}