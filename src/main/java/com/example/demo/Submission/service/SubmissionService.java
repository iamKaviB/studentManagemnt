package com.example.demo.Submission.service;

import com.example.demo.MarketingStaff.model.MarketingStaff;
import com.example.demo.MarketingStaff.repository.MarketingStaffRepository;
import com.example.demo.Submission.Dto.SubmissionDto;
import com.example.demo.Submission.model.Submission;
import com.example.demo.Submission.repository.SubmissionRepository;
import com.example.demo.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class SubmissionService {

    private SubmissionRepository submissionRepository;
    private StudentService studentService;

    public boolean addSubmission(SubmissionDto submissionDto, MultipartFile file) throws IOException {

        Submission submission = submissionRepository.findById(submissionDto.getId()).orElse(new Submission());

        submission.setModuleName(submissionDto.getModuleName());
        submission.setStudent(studentService.findById(submissionDto.getStudent()));



//            if(!file.isEmpty() && file != null) {
//                submission.setFile(file.getBytes());
//            }
            submissionRepository.save(submission);
            return true;


    }

    public List<Submission> findAll(){
        return submissionRepository.findAll();

    }


    public Submission findById(long id){
        return submissionRepository.findById(id).orElseThrow(()->new RuntimeException("Submission not found"));
    }

    public boolean existsById(long id){
        return submissionRepository.existsById(id);
    }

}
