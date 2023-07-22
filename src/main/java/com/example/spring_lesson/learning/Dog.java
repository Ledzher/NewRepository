package com.example.spring_lesson.learning;

public class Dog implements Pet {
    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("gav");
    }
}
