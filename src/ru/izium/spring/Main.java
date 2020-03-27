package ru.izium.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWord bean = (HelloWord) context.getBean("helloWord");
        System.out.println(bean);

        FactorySelfCreatedBean bean1 = context.getBean("factorySelfCreatedBean", FactorySelfCreatedBean.class);
        System.out.println(bean1);

        HelloWord bean2 = context.getBean("helloWord1", HelloWord.class);
        System.out.println(bean2);
    }
}
