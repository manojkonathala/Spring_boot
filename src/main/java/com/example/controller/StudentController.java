package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        //StudentService service = new StudentServiceImpl();
        return studentService.saveStudent(student);



    }

}
