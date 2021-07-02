package com.adhocsensei.ahscourseapi.controller;

import com.adhocsensei.ahscourseapi.dao.CourseRepository;
import com.adhocsensei.ahscourseapi.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseRepository repo;

    @GetMapping("/course")
    public List<Course> getAllCourses(@RequestParam(required = false) String title,
                                      @RequestParam(required = false) String category,
                                      @RequestParam(required = false) String location,
                                      @RequestParam(required = false) String date,
                                      @RequestParam(required = false) String shortDescription) {
        if (title != null) {
            return repo.findByTitle(title);
        }
        else if (category != null) {
            return repo.findByCategory(category);
        }
        else if (location != null) {
            return repo.findByLocation(location);
        }
        else if (date !=null) {
            return repo.findByDate(date);
        }
        else if (shortDescription !=null) {
            return repo.findByShortDescription(shortDescription);
        } else
        return repo.findAll();
    }

    @GetMapping("/course/sensei/{id}")
    public List<Course> getCourseBySenseiId(@PathVariable Long id) {
        return repo.findBySenseiId(id);
    }

    @GetMapping("/course/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping("/course")
    public Course createCourse(@RequestBody Course course) {
        return repo.save(course);
    }

    @PutMapping("/course/{id}")
    public void updateCourseById(@PathVariable Long id, @RequestBody Course course) {
        Optional<Course> optionalCourse = repo.findById(id);
        if (optionalCourse.isPresent()) {
            course.setId(id);
            repo.save(course);
        }
//        catch error and have appropriate response
    }

    @DeleteMapping("/course/{id}")
    public void deleteCourseById(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
