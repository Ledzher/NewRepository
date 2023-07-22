package com.example.spring_lesson.configuration;

import com.example.spring_lesson.Pet;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Gav");
    }

    public void init() {

        System.out.println("Class Dog: init method");
    }
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}