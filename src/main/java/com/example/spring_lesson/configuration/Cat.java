package com.example.spring_lesson.configuration;

import com.example.spring_lesson.Pet;
import org.springframework.stereotype.Component;

@Component("catN")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Myow");
    }
}