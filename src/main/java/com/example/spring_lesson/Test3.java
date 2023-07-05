package com.example.spring_lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callPet();


        System.out.println(person.getAge());
        System.out.println(person.getName());

        context.close();
    }
}
