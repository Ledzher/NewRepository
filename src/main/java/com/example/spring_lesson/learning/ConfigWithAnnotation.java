package com.example.spring_lesson.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);

        person.callTYourPet();
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();

        context.close();
    }
}
