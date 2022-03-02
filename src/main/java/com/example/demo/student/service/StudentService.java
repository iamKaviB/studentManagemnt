package com.example.demo.student.service;

import com.example.demo.student.model.Student;
import com.example.demo.student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public boolean addStudent(Student student){

        try {
            studentRepository.save(student);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }


    public Student findById(long id){
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("student not found"));
    }

    public boolean existsById(long id){
        return studentRepository.existsById(id);
    }
}
