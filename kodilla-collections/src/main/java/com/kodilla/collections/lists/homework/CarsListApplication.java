package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Saab;

import java.util.ArrayList;
public class CarsListApplication {
    public static void main(String[] args) {

        ArrayList<Car> carArrayList = new ArrayList<>();

        carArrayList.add( new BMW());
        Saab saab = new Saab();
        carArrayList.add(saab);
        carArrayList.add(new Ford());

        System.out.println("Wstępna lista aut:");
        for(Car car : carArrayList){
            CarUtils.describeCar(car);
        }
        carArrayList.remove(0);

        carArrayList.remove(saab);

        System.out.println("Końcowa lista aut:");
        for (Car car : carArrayList){
            CarUtils.describeCar(car);


        }

    }
}
