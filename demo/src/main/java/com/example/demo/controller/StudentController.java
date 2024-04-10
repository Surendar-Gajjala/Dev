package com.example.demo.controller;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudnts")
    public List<Student> getStudent(){
       return studentService.getAllStudent();
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student saved successfully";
    }
}
