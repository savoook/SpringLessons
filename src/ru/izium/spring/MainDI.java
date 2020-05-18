package ru.izium.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.di.Student;
import ru.izium.spring.di.Teacher;


public class MainDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/spring-config-di.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);

        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);

    }
}
