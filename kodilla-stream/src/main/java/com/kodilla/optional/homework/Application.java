package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher01 = new Teacher("Jan Kowalski");
        Teacher teacher02 = new Teacher("Aleksandra Nowak");

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Michał", teacher01));
        studentList.add(new Student("Ola", teacher02));
        studentList.add(new Student("Wojtek", null));
        studentList.add(new Student("Piotrek", teacher01));
        studentList.add(new Student("Ania", null));
        studentList.add(new Student("Basia", teacher02));

 for(Student student :studentList) {
     String studentName = student.getName();
     Optional<String> teacherName = Optional.ofNullable(student.getTeacher())
             .map(Teacher::getName);
     System.out.println("uczeń: " + studentName + ", Nauczyciel: " + teacherName.orElse("<undefined>"));
 }
    }
}
