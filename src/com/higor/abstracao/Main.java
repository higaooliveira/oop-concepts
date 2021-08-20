package com.higor.abstracao;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(120, 0, "Honda", "Civic");
        Radar radar = new Radar(80, car);

        while (car.currentVelocity < car.maxVelocity) {
            car.currentVelocity += 5;
            System.out.println("Velocidade atual do seu carro  " + car.currentVelocity);
        }

        radar.handle();
    }
}
