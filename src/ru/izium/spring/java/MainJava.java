package ru.izium.spring.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.izium.spring.di.Student;

public class MainJava {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationConfig config= (ApplicationConfig) context.getBean("getConfig");
        System.out.println(config);

        Student student=context.getBean("student", Student.class);
        System.out.println(student);
    }
}
