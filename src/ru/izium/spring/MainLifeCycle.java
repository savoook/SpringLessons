package ru.izium.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.lifecycle.LifecycleBean;


public class MainLifeCycle {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config/xml/spring-config-lifecycle.xml");
        LifecycleBean bean = (LifecycleBean) context.getBean("secret");
        System.out.println("Secret is " + bean.showMeSecret());
        context.registerShutdownHook();
    }
}
