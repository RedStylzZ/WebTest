package de.neuefische.webtest.model;

import lombok.Data;
import lombok.NonNull;

import java.util.Map;
import java.util.UUID;

@Data
public class StudentDB {

    @NonNull
    public final Student[] students;

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

}
