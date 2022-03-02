package com.example.demo.student.controllers;

import com.example.demo.student.model.Student;
import com.example.demo.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public boolean createNewStudent(@RequestBody Student request){
        return studentService.addStudent(request);
    }

    @PutMapping("/update")
    public boolean updateStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/findall")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findbyid")
    public Student findById(@RequestBody long id){
        return studentService.findById(id);
    }
}
