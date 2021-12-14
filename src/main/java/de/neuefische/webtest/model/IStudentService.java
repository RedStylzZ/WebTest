package de.neuefische.webtest.model;


import java.util.ArrayList;
import java.util.List;

public interface IStudentService {

    List<Student> students = new ArrayList<>();

    Student getStudentById(int id);

    List<Student> getStudents();

    Student addStudent(Student student);

    void removeStudent(Student student);

}
