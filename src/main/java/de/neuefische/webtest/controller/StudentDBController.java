package de.neuefische.webtest.controller;

import de.neuefische.webtest.model.Student;
import de.neuefische.webtest.model.StudentDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("studentDB")
public class StudentDBController {

    @GetMapping
    public StudentDB getStudentDB() {
        StudentDB studentDB = new StudentDB(new Student[]{new Student(21, 1, "Tizian", true), new Student(20, 2, "Ronja", true), new Student(20, 3, "Nico", true)});
        return studentDB;
    }


}
