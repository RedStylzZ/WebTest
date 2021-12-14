package de.neuefische.webtest.model;


import java.util.ArrayList;
import java.util.List;

public interface IStudentService {

    List<Student> students = new ArrayList<>();

    List<Student> getStudents();

    Student getStudentById(int id);

    Student addStudent(Student student);

    void removeStudent(Student student);

}
