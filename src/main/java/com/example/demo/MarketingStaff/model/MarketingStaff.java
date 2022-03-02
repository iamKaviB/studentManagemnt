package com.example.demo.MarketingStaff.model;

import com.example.demo.common.model.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_marketing_staff")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketingStaff extends Auditable {
    @Id
    @SequenceGenerator(name = "seq_marketing_staff", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marketing_staff")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    protected String username;

    @Column(name = "password")
    protected String password;
}
