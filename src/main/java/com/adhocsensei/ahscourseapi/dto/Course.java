package com.adhocsensei.ahscourseapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "courses")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String category;

    //    add format validation for date, time, duration
    private String date;
    private String time;
    private String location;
    private Integer duration;
    private Integer capacity;

    private String shortDescription;
    private String longDescription;

    private Long senseiId;

    public Course() {
    }

    public Course(Long id, String title, String category, String date, String time, String location, Integer duration, Integer capacity, String shortDescription, String longDescription, Long senseiId) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.date = date;
        this.time = time;
        this.location = location;
        this.duration = duration;
        this.capacity = capacity;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.senseiId = senseiId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Long getSenseiId() {
        return senseiId;
    }

    public void setSenseiId(Long senseiId) {
        this.senseiId = senseiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) && Objects.equals(title, course.title) && Objects.equals(category, course.category) && Objects.equals(date, course.date) && Objects.equals(time, course.time) && Objects.equals(location, course.location) && Objects.equals(duration, course.duration) && Objects.equals(capacity, course.capacity) && Objects.equals(shortDescription, course.shortDescription) && Objects.equals(longDescription, course.longDescription) && Objects.equals(senseiId, course.senseiId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, category, date, time, location, duration, capacity, shortDescription, longDescription, senseiId);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", duration=" + duration +
                ", capacity=" + capacity +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", senseiId=" + senseiId +
                '}';
    }
}
