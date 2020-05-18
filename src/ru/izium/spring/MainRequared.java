package ru.izium.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.di.Course;
import ru.izium.spring.di.School;
import ru.izium.spring.di.Student;
import ru.izium.spring.di.Teacher;


public class MainRequared {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config-annotation.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);

        Course java = context.getBean("java", Course.class);
        System.out.println(java+" "+Course.cash);

        Course python = context.getBean("python", Course.class);
        System.out.println(python+" "+Course.cash);
    }
}
