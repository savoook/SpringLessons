package ru.izium.spring.entity;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private int age;
    private  String breed;
    private Eat eat;

    public Dog() {
    }


    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }


    public List<Dog> addDog() {
        ArrayList<Dog> dogs=new ArrayList<>();
        Dog dog = new Dog("assd", 23, "312");
        dogs.add(dog);
        return dogs;
    }

    @Override
    public String toString() {
        return String.format("Собака по кличке %s, порода %s, возраст %s", name, breed, age);
    }
}
