package com.practise.course.Controller;

import com.practise.course.Entity.Course;
import com.practise.course.service.CourseService;
import com.practise.course.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController
{
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home()
    {
        return "this is home page";
    }
    // Get the courses

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
         return this.courseService.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }


    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course)
    {
         return this.courseService.addCourse(course);
    }


}
