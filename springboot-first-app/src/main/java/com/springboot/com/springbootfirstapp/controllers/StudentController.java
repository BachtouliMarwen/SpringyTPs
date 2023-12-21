package com.springboot.com.springbootfirstapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.springboot.com.springbootfirstapp.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Marouene","Bachtouli");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marouene", "Bachtouli"));
        students.add(new Student("Tony", "Cena"));
        students.add(new Student("Sanjay", "Jadhav"));
        students.add(new Student("Ram", "Jadhav"));
        students.add(new Student("Umesh", "Fadatare"));
        return students;
    }

    @GetMapping("/student/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String
                                               firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }

}
