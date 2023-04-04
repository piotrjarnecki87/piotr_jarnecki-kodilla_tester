package com.kodilla.abstracts.homework;

public class Main01 {
    public static void main(String[] args) {
        Job job1 = new Lawyer();
        Job job2 = new Doctor();

        Person person1 = new Person("Michał", 36, job1);
        person1.displayResponsibilities();
        person1.displaySalary();

        Person person2 = new Person("Ania", 41, job2);
        person2.displayResponsibilities();
        person2.displaySalary();
    }
}
