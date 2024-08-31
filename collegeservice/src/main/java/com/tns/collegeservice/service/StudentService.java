package com.tns.collegeservice.service;



import com.tns.collegeservice.entity.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}

