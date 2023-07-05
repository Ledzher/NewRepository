package com.example.spring_lesson.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context4.xml");

        Cat cat = context.getBean("cat", Cat.class);
        cat.say();

        context.close();
    }
}
