package com.kodilla.inheritance.homework;

public class Checker {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows(2000);
        windows.turnOn();
        windows.turnOff();
        System.out.println("Windows year: " + windows.releaseYear());


        OperatingSystem linux = new Linux(2005);
        linux.turnOn();
        linux.turnOff();
        System.out.println("Linux year " + linux.releaseYear());
    }
}
