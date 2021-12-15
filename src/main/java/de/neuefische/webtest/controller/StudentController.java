package de.neuefische.webtest.controller;

import de.neuefische.webtest.model.Student;
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
