package com.example.spring_lesson;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    public void say(){
        System.out.println("Gav");
    }

    public Dog(){
        System.out.println("dog bean is created");
    }

    public void init(){
        System.out.println("Class Dog: init method");

    }
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }


}
