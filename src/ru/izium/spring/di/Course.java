package ru.izium.spring.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int duration;
    public static List<Course> cash = new ArrayList<>();

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @PostConstruct
    public void cashCourses() {
        cash.add(this);
    }

    @PreDestroy
    public void destroyCash() {

    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
