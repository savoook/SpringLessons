package ru.izium.spring.component;

import org.springframework.stereotype.Repository;
import ru.izium.spring.di.Course;
import ru.izium.spring.di.Student;
import ru.izium.spring.di.Teacher;
@Repository
public class TeacherRepositoryImpl implements TeacherRepository {
    @Override
    public Teacher getTeacher() {
        Teacher teacher=new Teacher();
        teacher.setCourse(new Course("html",16));
        teacher.setStudent(new Student());
        return teacher;
    }
}
