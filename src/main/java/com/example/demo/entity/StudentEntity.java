package com.exmaple.demo.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@En
public class StudentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.Identity)
     private long id;
     private String name;
     private String email;
     private float cgpa;
}