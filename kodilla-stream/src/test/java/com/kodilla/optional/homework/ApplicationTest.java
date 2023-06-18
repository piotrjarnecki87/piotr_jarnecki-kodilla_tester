package com.kodilla.optional.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ApplicationTest {

    //test wyświetlenie bez nulla
    // wyświetlenie bez imienia
    //

    @Test
    public void testStudentTeacherMapping() {
        Teacher teacher01 = new Teacher("Jan Kowalski");
        Teacher teacher02 = new Teacher("Aleksandra Nowak");

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Michał", teacher01));
        studentList.add(new Student("Ola", teacher02));
        studentList.add(new Student("Wojtek", null));
        studentList.add(new Student("Piotrek", teacher01));
        studentList.add(new Student("Ania", null));
        studentList.add(new Student("Basia", teacher02));

        for (Student student : studentList) {
            String studentName = student.getName();
            Optional<String> teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName);
            System.out.println("uczeń: " + studentName + ", Nauczyciel: " + teacherName.orElse("<undefined>"));

            Assertions.assertNotNull(studentName);

          if(student.getTeacher() !=null){
              Assertions.assertNotNull(teacherName);
              Assertions.assertEquals(student.getTeacher().getName(), teacherName.get());
          }
          else {
              Assertions.assertFalse(teacherName.isPresent());
          }
        }
    }
}