package ru.izium.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.izium.spring.di.Course;
import ru.izium.spring.di.Student;

@Configuration
public class ApplicationConfig {
    @Bean
    public ApplicationConfig getConfig() {
        return new ApplicationConfig();
    }

    @Override
    public String toString() {
        return "java based application configuration";
    }
    @Bean
    public Student student(Course course){
        return new Student(course, "Сидор Сидоров");
    }
    @Bean
    public Course course(){
        return new Course("Spring",231);
    }
}
