package ru.izium.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.di.School;


public class MainCollectionsRef {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/spring-config-collections.xml");
        School school = (School) context.getBean("school");
        System.out.println(school);
    }
}
