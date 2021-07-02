package com.adhocsensei.ahscourseapi.dao;

import com.adhocsensei.ahscourseapi.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByTitle(String title);
    List<Course> findByCategory(String category);
    List<Course> findByLocation(String location);
    List<Course> findByDate(String date);
    List<Course> findByShortDescription(String shortDescription);
    List<Course> findBySenseiId(Long senseiId);
}
