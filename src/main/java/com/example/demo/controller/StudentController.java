package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService ser;

    // Add a new student
    @PostMapping("/addStudents")
    public StudentEntity addStudents(@RequestBody StudentEntity student) {
        return ser.addStudents(student);
    }

    // Get all students
    @GetMapping("/getStudents")
    public List<StudentEntity> getStudents() {
        return ser.getStudents();
    }

    // Get a student by ID
    @GetMapping("/getStudent/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return ser.getStudentById(id);
    }

    // Delete a student by ID
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        // Get student by ID
        StudentEntity student = ser.getStudentById(id);

        // Check if student exists (non-null)
        if (student != null) {
            ser.deleteStudentById(id);
            return "Student deleted successfully.";
        } else {
            return "Student not found.";
        }
    }
}
