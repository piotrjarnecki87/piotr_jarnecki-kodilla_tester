package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public  OperatingSystem(int year){
        this.year = year;
    }

    public void turnOn(){
        System.out.println("Turn On");
    }

    public void turnOff(){
        System.out.println("Turn Off");
    }
    public int releaseYear(){
        return year;
    }
}
