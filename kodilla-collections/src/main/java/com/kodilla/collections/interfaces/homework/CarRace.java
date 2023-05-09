package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        doRace(bmw);
        Saab saab = new Saab();
        doRace(saab);
        Ford ford = new Ford();
        doRace(ford);
    }
    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println("Aktualna prędkość: " + car.getSpeed());
    }
}
