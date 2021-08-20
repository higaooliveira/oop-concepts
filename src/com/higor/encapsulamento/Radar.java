package com.higor.encapsulamento;


public class Radar {
    private int maxVelocity;

    private Car currentCar;

    public Radar() { }

    public Radar(int maxVelocity, Car currentCar) {
        this.maxVelocity = maxVelocity;
        this.currentCar = currentCar;
    }

    public void handle() {
        if (verifyVelocity()){
            giveATicket();
        }
    }

    private boolean verifyVelocity(){
        System.out.println();
        System.out.println("Verificando velocidade do carro \n");
        return this.currentCar.getCurrentVelocity() > this.getMaxVelocity();
    }

    private void giveATicket() {
        System.out.println("Seu carro foi multado por passar a " + this.currentCar.getCurrentVelocity() + "KM/h no Radar");
    }


    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public Car getCurrentCar() {
        return currentCar;
    }

    public void setCurrentCar(Car currentCar) {
        this.currentCar = currentCar;
    }
}
