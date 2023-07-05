package com.example.spring_lesson.component;

import com.example.spring_lesson.Pet;
import org.springframework.stereotype.Component;

@Component // по умолчанию scope component - singleton
public class Cat implements Pet {
    public Cat(){
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
