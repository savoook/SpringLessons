package ru.izium.spring.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.izium.spring.di.Course;

@Component
public class SchoolService {
    @Bean
    @Qualifier("java")
    public Course getJavaCourse() {
        return new Course("java", 54);
    }

    @Bean
    @Qualifier("python")
    public Course getPythonCourse() {
        return new Course("python", 45);
    }
}
