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

     public void setId(int id){
        this.id = id;
     }
     public void getId(){
        return this.id;
     }
     public void setId(String name){
        this.name = name;
     }
     public void getName(){
        return this.name;
     }
     public void setId(String name){
        this.name = name;
     }
     public void getName(){
        return this.name;
     }
     public void setId(String name){
        this.name = name;
     }
     public void getName(){
        return this.name;
     }
}