package com.practise.course.service;

import com.practise.course.Entity.Course;
import com.practise.course.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseDao courseDao;

    public CourseServiceImpl()
    {
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long parseLong) {
        Course now= courseDao.getOne(parseLong);
        return now;
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }
}
