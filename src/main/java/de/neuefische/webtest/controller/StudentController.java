package de.neuefische.webtest.controller;

import de.neuefische.webtest.model.Student;
import de.neuefische.webtest.model.StudentDB;
import de.neuefische.webtest.model.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentDB studentDB = new StudentDB(new Student[]{
            new Student(21, 1, "Tizian", true),
            new Student(20, 2, "Ronja", true),
            new Student(20, 3, "Nico", true)});

    private final StudentService studentService = new StudentService();

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping()
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}
