package ru.izium.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.scope.PrototypeBean;
import ru.izium.spring.scope.SingletonBean;


public class MainScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/xml/spring-config-scope.xml");

        SingletonBean singletonBean1 = context.getBean("singletone", SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean("singletone", SingletonBean.class);
        PrototypeBean prototypeBean1 = context.getBean("prototype", PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean("prototype", PrototypeBean.class);
        System.out.println(singletonBean1);
        System.out.println(singletonBean2);
        System.out.println(prototypeBean1);
        System.out.println(prototypeBean2);
    }
}
