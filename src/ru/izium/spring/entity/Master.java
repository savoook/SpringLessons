package ru.izium.spring.entity;

import java.util.List;

public class Master {
    private String fio;
    private Dog dog;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Master{" +
                "fio='" + fio + '\'' +
                ", dog=" + dog +
                '}';
    }
}
