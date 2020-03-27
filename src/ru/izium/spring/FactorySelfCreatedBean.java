package ru.izium.spring;

public class FactorySelfCreatedBean {
    private static FactorySelfCreatedBean bean = new FactorySelfCreatedBean();

    private FactorySelfCreatedBean() {
    }

    public static FactorySelfCreatedBean getInstance() {
        return bean;
    }

    @Override
    public String toString() {
        return "FSCB!";
    }
}
