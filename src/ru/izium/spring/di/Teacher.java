package ru.izium.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher {
    private Student student;
    @Autowired
    @Qualifier("python")
    private Course course;

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("Teacher tell student %s learn lesson on course %s продолжительностью %s", student.getFio(), course.getName(), course.getDuration());
    }
}
