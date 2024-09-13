package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
    public  String upsert(Course course) ;

    public Course getById(Integer id);
    public List<Course> getAllCourses();

    public String deleteById(Integer id);
}


