package com.example.spring_lesson.learning;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
