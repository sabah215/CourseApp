package com.futurex.course.CourseApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseid;
    private String courseName;
    private String author;

    public Course() {

    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
