package ru.izium.spring.di;

import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Course course;
    private String fio;

    public Student() {
    }

    public Student(Course course, String fio) {
        this.course = course;
        this.fio = fio;
    }
@Required
    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
//        return "Студент "+fio+" поступил на курс "+course;
//        return String.format("student %s study on course %s",fio, course.getName());
        return String.format("student %s study on course %s",fio, course);
    }
}
