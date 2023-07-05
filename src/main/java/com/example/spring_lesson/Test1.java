package com.example.spring_lesson;

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.say();

        Pet pet = new Cat();
        pet.say();

        Pet pet1 = new Dog();
        pet1.say();
    }
}
