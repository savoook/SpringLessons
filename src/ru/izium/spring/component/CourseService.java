package ru.izium.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.izium.spring.di.Course;
import ru.izium.spring.di.Student;
import ru.izium.spring.di.Teacher;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository repository;

    public Teacher getActiveTeacher()  {
        List<Course> courses = repository.getAllCourses();
        Teacher teacher = new Teacher();
        teacher.setCourse(courses.get(0));
        teacher.setStudent(new Student(courses.get(0),"hj"));
        return teacher;
    }
}
