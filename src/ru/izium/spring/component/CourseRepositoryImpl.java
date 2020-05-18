package ru.izium.spring.component;

import org.springframework.stereotype.Repository;
import ru.izium.spring.di.Course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public List<Course> getAllCourses() {
        List<Course> courses=new ArrayList<>();
        courses.add(new Course("java",123));
        courses.add(new Course("python",321));
        return courses;
    }
}
