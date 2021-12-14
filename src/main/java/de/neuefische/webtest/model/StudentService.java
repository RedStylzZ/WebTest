package de.neuefische.webtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentService implements IStudentService {


    @Override
    public Student getStudentById(int id) {
        if (students.isEmpty()) return null;
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }
}
