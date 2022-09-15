package com.final_project.controller;

import com.final_project.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.repository.CourseRepository;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository repository;

    @GetMapping("/course")
    public List<Course> findCourse(){
        return repository.findAll();
    }

    @PutMapping("/course/add")
    public Course CreateOrUpdateCourse(Course course) {
        return repository.save(course);
    }

    @GetMapping("/course/{id_course}")
    public List<Course> findCourseByID(@PathVariable Integer id_course){
        return repository.findCourseByIdCourse(id_course);
    }

    @DeleteMapping("/courses/{id_course}")
    public Course deleteCourseByID(@PathVariable Integer id_course){
        return repository.deleteCourseByIdCourse(id_course);
    }
}
