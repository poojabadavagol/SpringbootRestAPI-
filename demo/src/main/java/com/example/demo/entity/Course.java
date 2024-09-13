package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="crud_data")
 public class Course {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Integer id;
private String Name;
private  String price;

 }