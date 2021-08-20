package com.higor.abstracao;

public class Radar {
    public int maxVelocity;

    public Car currentCar;

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
        return this.currentCar.currentVelocity > this.maxVelocity;
    }

    private void giveATicket() {
        System.out.println("Seu carro foi multado por passar a " + this.currentCar.currentVelocity + "KM/h no Radar");
    }

}
