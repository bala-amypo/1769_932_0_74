package com.exmaple.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class StudentEntity{

    @Id
    @GeneratedValue()
     private long id;
     private String name;
     private String email;
     private float cgpa;
}