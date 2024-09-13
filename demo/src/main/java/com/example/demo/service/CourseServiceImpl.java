package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;
import java.util.Optional;

import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl  implements CourseService{

    @Autowired
    private CourseRepository courseRepo;
    @Override
    public String upsert(Course course) {

        courseRepo.save(course);
        return "success";
    }

    @Override
    public Course getById(Integer id) {
       Optional<Course> findById =courseRepo.findById(id);
       if(findById.isPresent()){
           return findById.get();
       }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();

    }

    @Override
    public String deleteById(Integer id) {
        if(courseRepo.existsById(id)){
            courseRepo.deleteById(id);
            return "Delete Success";
        }else{
            return "No Record Found";

        }

    }
}
