package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
        Principal michal = new Principal("Michał", "Kowalski");
        Principal ania = new Principal("Ania", "Nowak");
        Principal tomasz = new Principal("Tomasz", "Olszewski");
        Principal ola = new Principal("Ola", "Kowalska");

        School michalSchool = new School(Arrays.asList("Lodz"));
        School aniaSchool = new School(Arrays.asList("Warszawa"));
        School  tomaszSchool = new School(Arrays.asList("Gdańsk"));
        School olaSchool = new School(Arrays.asList("Wrocław"));



        schoolMap.put(michal,michalSchool);
        schoolMap.put(ania,aniaSchool);
        schoolMap.put(tomasz,tomaszSchool);
        schoolMap.put(ola, olaSchool);



        for(Map.Entry<Principal, School> schoolEntry : schoolMap.entrySet()){

            Principal principal = schoolEntry.getKey();
            School school = schoolEntry.getValue();

            System.out.println("Dyrektor: " + principal.getFirstname() + " " + principal.getLastname());
            System.out.println("Szkoła: " + school.getClasses());
        }
    }
}
