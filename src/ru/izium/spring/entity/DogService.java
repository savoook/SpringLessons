package ru.izium.spring.entity;

import org.springframework.context.annotation.Bean;

public class DogService {
    public Dog addDog() {
        Dog dog = new Dog("fhfh", 10, "hasky");
        return dog;
    }
}
