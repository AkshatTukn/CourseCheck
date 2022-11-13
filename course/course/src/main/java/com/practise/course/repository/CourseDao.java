package com.practise.course.repository;

import com.practise.course.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
