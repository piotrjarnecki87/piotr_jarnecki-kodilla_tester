package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<String> classes =new ArrayList<>();

    public School (List<String> classes){
        this.classes = classes;
    }

    public List<String> getClasses() {
        return classes;
    }


    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }
}
