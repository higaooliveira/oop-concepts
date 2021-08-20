package com.higor.encapsulamento;


public class Main {

    public static void main(String[] args) {
        Car car = new Car(120, 0, "Toyota", "Corolla");

        Radar radar = new Radar(80, car);

        car.speedUp();

        radar.handle();
    }
}