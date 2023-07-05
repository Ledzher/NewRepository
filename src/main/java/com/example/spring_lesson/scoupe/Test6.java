package com.example.spring_lesson.scoupe;

import com.example.spring_lesson.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context3.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();



        context.close();
    }
}
