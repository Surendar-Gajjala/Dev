package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "STUDENT")
@PrimaryKeyJoinColumn(name = "ID")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

     private String firstName;

    private String lastName;

    private String email;

    private String phoneNo;
}
