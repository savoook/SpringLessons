package ru.izium.spring.scope;

public class PrototypeBean {
    @Override
    public String toString() {
        return "prototype" + hashCode();
    }
}
