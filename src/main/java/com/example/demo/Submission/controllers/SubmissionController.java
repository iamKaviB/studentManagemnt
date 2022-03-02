package com.example.demo.Submission.controllers;

import com.example.demo.Submission.Dto.SubmissionDto;
import com.example.demo.Submission.model.Submission;
import com.example.demo.Submission.service.SubmissionService;
import com.example.demo.student.model.Student;
import com.example.demo.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/submission")
@AllArgsConstructor
public class SubmissionController {
    private final SubmissionService submissionService;

    @PostMapping("/create")
    public boolean createNewSubmission(@RequestBody SubmissionDto request,@RequestParam MultipartFile file) throws IOException {
        return submissionService.addSubmission(request,file);
    }

    @PutMapping("/update")
    public boolean updateSubmisson(@RequestBody SubmissionDto request, @RequestParam MultipartFile file) throws IOException {
        return submissionService.addSubmission(request,file);
    }

    @GetMapping("/findall")
    public List<Submission> findAll(){
        return submissionService.findAll();
    }

    @GetMapping("/findbyid")
    public Submission findById(@RequestBody long id){
        return submissionService.findById(id);
    }
}
