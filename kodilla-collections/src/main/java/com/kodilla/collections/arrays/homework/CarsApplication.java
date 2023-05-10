package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarsApplication {
    public static Car drawCar() {
        int speed = (int) (Math.random() * 50);
        return new Car() {
            private int currentSpeed = speed;

            @Override
            public int getSpeed() {
                return currentSpeed;
            }

            @Override
            public void increaseSpeed() {
                currentSpeed++;
            }

            @Override
            public void decreaseSpeed() {
                currentSpeed--;
            }
        };

    }
    public static void main(String[] args) {
        int arraySize = (int) (Math.random() * 15) + 1;
        Car[] cars = new Car[arraySize];
        for (int i = 0; i < arraySize; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }


}

