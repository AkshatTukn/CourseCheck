package com.practise.course.service;

import com.practise.course.Entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course>getCourses();


    Course getCourse(long parseLong);

    Course addCourse(Course course);
}
