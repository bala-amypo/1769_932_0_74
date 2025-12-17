package com.exmaple.demo.entity;
import jakarta.persistence.Entity;

@Entity
public class StudentEntity{
     private long id;
     private String name;
     private String email;
     private float cgpa;
}