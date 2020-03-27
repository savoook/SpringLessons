package ru.izium.spring;

public class FactoryBean {
    private FactoryBean() {
    }

    private static HelloWord helloWordBean = new HelloWord();

    public HelloWord createBean() {
        return helloWordBean;
    }
}
//