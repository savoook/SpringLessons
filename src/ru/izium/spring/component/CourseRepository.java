package ru.izium.spring.component;

import ru.izium.spring.di.Course;

import java.util.List;

public interface CourseRepository {
    public List<Course> getAllCourses();
}
