package com.example.demo.Submission.Dto;

import com.example.demo.student.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionDto {

    private long id;

    private String moduleName;

    private byte[] file;

    private long student;
}
