package com.example.demo.Submission.model;

import com.example.demo.common.model.Auditable;
import com.example.demo.student.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_submission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Submission extends Auditable {

    @Id
    @SequenceGenerator(name = "seq_submission", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_submission")
    private long id;

    @Column(name = "module_name")
    private String moduleName;

    @Column(name = "file")
    @Lob
    private byte[] file;

    @ManyToOne
    private Student student;


}
