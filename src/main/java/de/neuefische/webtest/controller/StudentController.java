package de.neuefische.webtest.controller;

import de.neuefische.webtest.model.Student;
import de.neuefische.webtest.model.StudentDB;
import de.neuefische.webtest.model.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

 /*   private final StudentDB studentDB = new StudentDB(new Student[]{
            new Student(21, 1, "Tizian", true),
            new Student(20, 2, "Ronja", true),
            new Student(20, 3, "Nico", true)});*/

    @GetMapping
    public List<Student> getStudent() {
        return service.getStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @PutMapping()
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
}
