package ru.izium.spring.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.java.ApplicationConfig;

import java.util.List;

public class MainMix {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/mix/spring-mix-config.xml");
        Klinika klinika=context.getBean("klinika",Klinika.class);
        System.out.println(klinika);
    }

}
