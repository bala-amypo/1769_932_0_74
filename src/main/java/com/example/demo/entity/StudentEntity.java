package com.exmaple.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.Identity)
     private long id;
     private String name;
     private String email;
     private float cgpa;

    public StudentEntity(long id,String name,String email,float cgpa){
        this.id = id;
        this.name = name ;
        this.email = email;
        this.cgpa = cgpa;


    }
    public StudentEntity(){}
     public void setName(String name){
        this.name = name;
     }
     public void getName(){
        return this.name;
     }
     public void setEmail(String email){
        this.email = email;
     }
     public void getEmail(){
        return this.email;
     }
     public void setCgpa(float cgpa){
        this.cgpa = cgpa;
     }
     public void getCgpa(){
        return this.cgpa;
     }
}