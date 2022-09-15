package com.final_project.repository;

import com.final_project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findCourseByIdCourse(Integer idCourse);
    Course deleteCourseByIdCourse(Integer idCourse);
}
