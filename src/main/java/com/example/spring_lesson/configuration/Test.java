package com.example.spring_lesson.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personsBean", Person.class);
        person.callPet();


        context.close();
    }
}
