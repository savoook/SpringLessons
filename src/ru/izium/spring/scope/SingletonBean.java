package ru.izium.spring.scope;

public class SingletonBean {
    @Override
    public String toString() {
        return "singletone" + hashCode();
    }
}
