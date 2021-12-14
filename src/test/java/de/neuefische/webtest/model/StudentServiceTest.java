package de.neuefische.webtest.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @Test
    void getStudentById() {
        StudentService studentService = mock(StudentService.class);

        when(studentService.getStudentById(24)).thenReturn(new Student(24, "Tizian", 21));

        assertNotNull(studentService.getStudentById(24));
        verify(studentService).getStudentById(24);
    }
}